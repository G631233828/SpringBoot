package gjb.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import gjb.jpa.pojo.User;


/**
 * 
 * @author fliay
 * ����T: ��ǰ��Ҫӳ���ʵ��
 * ����ID:��ǰӳ��ʵ���е�OID����
 * 
 *
 *
 */
public interface UserRepositoryByCrudRepository extends CrudRepository<User, Integer> {

}
