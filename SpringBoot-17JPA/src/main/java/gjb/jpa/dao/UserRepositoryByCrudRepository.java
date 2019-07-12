package gjb.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import gjb.jpa.pojo.User;


/**
 * 
 * @author fliay
 * 参数T: 当前需要映射的实体
 * 参数ID:当前映射实体中的OID类型
 * 
 *
 *
 */
public interface UserRepositoryByCrudRepository extends CrudRepository<User, Integer> {

}
