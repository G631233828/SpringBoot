package gjb.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

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
public interface UserRepository extends JpaRepository<User, Integer> {

}
