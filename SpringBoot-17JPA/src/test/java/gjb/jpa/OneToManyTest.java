package gjb.jpa;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import gjb.jpa.dao.UserRepository;
import gjb.jpa.pojo.Roles;
import gjb.jpa.pojo.User;

/**
 * 一对多的关联关系
 * @author fliay
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MainClass.class)
public class OneToManyTest {
	@Autowired
	private UserRepository r;
	
	
	/**
	 * 一对多关联关系的添加
	 */
	@Test
	public void testSave(){
		//1.创建用户
		User u = new User();
		u.setName("张三");
		u.setPassword("123456");
		//2.创建角色
		Roles r = new Roles();
		r.setRoleName("管理员");
		//3.关联
		r.getUser().add(u);
		u.setRoles(r);
		//4.保存
		this.r.save(u);
	}
	
	
	@Test
	@Transactional
	public void findUser(){
		User user = this.r.getOne(1);
		System.out.println(user.getName());
		Roles role = user.getRoles();
		System.out.println(role.getRoleName());
	}
	
	
	
	
	
	
	
	
}
