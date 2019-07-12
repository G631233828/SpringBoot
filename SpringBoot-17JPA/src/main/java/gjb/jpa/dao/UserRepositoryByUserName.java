package gjb.jpa.dao;

import java.util.List;

import org.springframework.data.repository.Repository;

import gjb.jpa.pojo.User;

/**
 * 
 * @author fliay
 * Repository 接口的方法名称命名查询
 *
 *
 *
 */
public interface UserRepositoryByUserName extends Repository<User, Integer> {
	
	//方法名必须要遵循驼峰式命名规则，findByXXX  XXX是属性名称  首字母要大写+查询条件（首字母大写）
	List<User> findByName(String name);
	//通过两个条件进行查询，必须都要满足格式要求
	User findByNameAndPassword(String name,String password);
	//模糊查询
	List<User> findByNameLike(String name);
	
}
