package gjb.jpa.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.test.annotation.Rollback;

import gjb.jpa.pojo.User;

/**
 * 
 * @author fliay
 *
 *         Repository @Query 注解使用 使用@Query作为查询 方法的名称无所谓
 */
public interface UserRepositoryQueryAnnotation extends Repository<User, Integer> {

	
	

	@Query("from User  where name =?1")
	List<User> queryByNameUseHQL1(String  name);
	/**
	 * @param name
	 * @return
	 * nativeQuery=true 标识不对语句进行转换处理
	 */
	@Query(value="select * from user2 where name = ?",nativeQuery=true)
	List<User> queryByNameUseHQL2(String  name);
	
	@Query("from User  where name =:name")
	List<User> queryByNameUseHQL3(@Param("name") String  name);
	
	@Query("update User set name =:name where id=:id")
	@Modifying//更新的时候需要添加modifying 就是将update放到了query中
	@Transactional//需要天机事务不然会报错
	@Rollback(true)//取消自动回滚
	public void updateUser(@Param("name")String name,@Param("id")Integer id);
	

}
