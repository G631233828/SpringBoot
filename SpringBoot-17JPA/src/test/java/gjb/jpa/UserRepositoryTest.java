package gjb.jpa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gjb.jpa.dao.UserRepository;
import gjb.jpa.dao.UserRepositoryByCrudRepository;
import gjb.jpa.dao.UserRepositoryByJPASpecificationExecutor;
import gjb.jpa.dao.UserRepositoryByUserName;
import gjb.jpa.dao.UserRepositoryQueryAnnotation;
import gjb.jpa.dao.UserRepositorybyPagingAndSortingRepository;
import gjb.jpa.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MainClass.class)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserRepositoryByUserName userRepositoryByUserName;

	@Autowired
	private UserRepositoryQueryAnnotation userRepositoryQueryAnnotation;

	@Autowired
	private UserRepositoryByCrudRepository crud;

	@Autowired
	private UserRepositorybyPagingAndSortingRepository sorting;
	
	@Autowired
	private UserRepositoryByJPASpecificationExecutor speci;

	@Test
	public void testSave() {

		User u = new User();
		u.setName("张三");
		u.setPassword("234");
		this.userRepository.save(u);

	}

	@Test
	public void testGetName() {
		List<User> u = this.userRepositoryByUserName.findByName("张三");
		u.forEach((user) -> {
			System.out.println(user);
		});
	}

	@Test
	public void testFineByNameAndPassword() {
		User user = this.userRepositoryByUserName.findByNameAndPassword("张三", "234");
		System.out.println(user);
	}

	@Test
	public void testFineByNameLike() {
		List<User> users = this.userRepositoryByUserName.findByNameLike("%张%");
		users.forEach((user) -> {
			System.out.println(user);
		});
	}

	@Test
	public void testQueryFindUserUseHQL() {
		List<User> users = this.userRepositoryQueryAnnotation.queryByNameUseHQL2("张三");
		users.forEach((user) -> {
			System.out.println(user);
		});

	}

	@Test
	public void testUpdate() {
		this.userRepositoryQueryAnnotation.updateUser("张小三", 1);

		List<User> users = this.userRepositoryByUserName.findByNameLike("%张%");
		users.forEach((user) -> {
			System.out.println(user);
		});
	}

	/**
	 * 测试crud的更新
	 */
	@Test
	public void testCrudRepositoryUpdate() {

		User user = new User();
		user.setId(2);
		user.setName("shanghai");
		user.setPassword("1212111");
		this.crud.save(user);
	}

	@Test
	public void testCrudRepositoryfindOne() {
		Optional<User> user = this.crud.findById(1);
		System.out.println(user.get());
	}

	@Test
	public void testCrudRepositoryfindAll() {
		Iterable<User> users = this.crud.findAll();
		for (Iterator it = users.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}

	/**
	 * 测试PagingAndSortingRepository  排序
	 */
	@Test
	public void testPagingAndSortingRepositorySort() {
		// Order定义排序
		Order order = new Order(Direction.DESC, "id");
		// Sort对象封装了配需规则
		Sort sort = new Sort(order);
		Iterable<User> list = this.sorting.findAll(sort);
		for(Iterator<User> it = list.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
	
	
	/**
	 * 测试PagingAndSortingRepository  分页
	 */
	@Test
	public void testPagingAndSortingRepositoryPaging() {
		//Pageable 封装了分页的参数，当前页，每页显示的条数，注意：当前页是从0开始
		Pageable pageable = new PageRequest(0, 2);
		Page<User> userPage = this.sorting.findAll(pageable);
		System.out.println("总共："+userPage.getTotalPages()+"页");
		System.out.println("每页显示："+userPage.getSize()+"条数据");
		System.out.println("总共："+userPage.getTotalElements()+"条数据");
			
		userPage.forEach((user)->{
			System.out.println(user);
		});
	}
	/**
	 * 测试PagingAndSortingRepository  分页
	 */
	@Test
	public void testPagingAndSortingRepositoryPagingToSort() {
		// Order定义排序
		Order order = new Order(Direction.DESC, "id");
		// Sort对象封装了配需规则
		Sort sort = new Sort(order);
		//Pageable 封装了分页的参数，当前页，每页显示的条数，注意：当前页是从0开始
		Pageable pageable = new PageRequest(0, 2,sort);
		pageable.getSortOr(sort);
		Page<User> userPage = this.sorting.findAll(pageable);
		System.out.println("总共："+userPage.getTotalPages()+"页");
		System.out.println("每页显示："+userPage.getSize()+"条数据");
		System.out.println("总共："+userPage.getTotalElements()+"条数据");
		userPage.forEach((user)->{
			System.out.println(user);
		});
	}
	
	
	/**
	 * 测试JpaSpecificationExecutor 单条件查询
	 */
	@Test
	public void testJpaSpecificationExecutor1() {
		/**
		 * 用于封装查询条件
		 */
		Specification<User> query = new Specification<User>() {
			/**
			 * Predicate 封装了单个查询条件， 一个Predicate 就是一个查询条件
			 * Root<User> root 查询对象属性的封装
			 * CriteriaQuery<?> query 封装了要执行的查询中各个部分的信息 select from order by
			 * CriteriaBuilder criteriaBuilder 查询条件的构造器
			 */
			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
			   //where password = 123
				/**
				 * 参数1  表示当前要查询的属性
				 * 参数2  表示查询查询的值 
				 */
				Predicate pre = criteriaBuilder.equal(root.get("name"), "张三");
				return pre;
			}
		};
		List<User> list = this.speci.findAll(query);
		list.forEach((user)->{
			System.out.println(user);
		});
	
	}
	
	/**
	 * 测试JpaSpecificationExecutor 多条件查询
	 */
	@Test
	public void testJpaSpecificationExecutor2() {
		/**
		 * 用于封装查询条件
		 */
		Specification<User> query = new Specification<User>() {
			/**
			 * Predicate 封装了单个查询条件， 一个Predicate 就是一个查询条件
			 * Root<User> root 查询对象属性的封装
			 * CriteriaQuery<?> query 封装了要执行的查询中各个部分的信息 select from order by
			 * CriteriaBuilder criteriaBuilder 查询条件的构造器
			 */
			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				//where name = 张三 and age =20
				/**
				 * 参数1  表示当前要查询的属性
				 * 参数2  表示查询查询的值 
				 */
				List<Predicate> list = new ArrayList<>();
				list.add(criteriaBuilder.equal(root.get("name"), "张三"));
				list.add(criteriaBuilder.equal(root.get("password"), "2341"));
				Predicate[] arr = new Predicate[list.size()];
				return criteriaBuilder.and(list.toArray(arr));
			}
		};
		List<User> list = this.speci.findAll(query);
		list.forEach((user)->{
			System.out.println(user);
		});
		
	}
	
	
	
	
	/**
	 * 测试JpaSpecificationExecutor 多条件查询 2
	 */
	@Test
	public void testJpaSpecificationExecutor3() {
		/**
		 * 用于封装查询条件
		 */
		Specification<User> query = new Specification<User>() {
			/**
			 * Predicate 封装了单个查询条件， 一个Predicate 就是一个查询条件
			 * Root<User> root 查询对象属性的封装
			 * CriteriaQuery<?> query 封装了要执行的查询中各个部分的信息 select from order by
			 * CriteriaBuilder criteriaBuilder 查询条件的构造器
			 */
			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				//where name = 张三 and age =20
				/**
				 * 参数1  表示当前要查询的属性
				 * 参数2  表示查询查询的值 
				 */
//				List<Predicate> list = new ArrayList<>();
//				list.add(criteriaBuilder.equal(root.get("name"), "张三"));
//				list.add(criteriaBuilder.equal(root.get("password"), "2341"));
//				Predicate[] arr = new Predicate[list.size()];
				
				//如果 查询条件中即有and 又 有or 可以组合起来  cb.or(cb.and(xx),cb.and(xx));
				return criteriaBuilder.and(criteriaBuilder.equal(root.get("name"), "张三"),criteriaBuilder.equal(root.get("password"), "234"));
			}
		};
		List<User> list = this.speci.findAll(query);
		list.forEach((user)->{
			System.out.println(user);
		});
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
