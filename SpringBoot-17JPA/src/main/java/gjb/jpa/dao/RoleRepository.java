package gjb.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import gjb.jpa.pojo.Roles;



/**
 * 
 * @author fliay
 * 参数T: 当前需要映射的实体
 * 参数ID:当前映射实体中的OID类型
 * 
 *
 *
 */
public interface RoleRepository extends JpaRepository<Roles, Integer> {

}
