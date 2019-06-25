package gjb.ehcache.repository;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface CrudRepository<T, ID extends Serializable> extends Repository<T, ID> {
 
	<S extends T> S save(S entity); // ���沢���أ��޸ĺ�ģ�ʵ��
 
	<S extends T> Iterable<S> save(Iterable<S> entities); // ���沢���أ��޸ĺ�ģ�ʵ�弯��
 
	T findOne(ID id); // ����ID��ȡʵ��
 
	boolean exists(ID id); // �ж�ָ��ID��ʵ���Ƿ����
 
	Iterable<T> findAll(); // ��ѯ����ʵ��
 
	Iterable<T> findAll(Iterable<ID> ids); // ����ID���ϲ�ѯʵ��
 
	long count(); // ��ȡʵ�������
 
	void delete(ID id); // ɾ��ָ��ID��ʵ��
 
	void delete(T entity); // ɾ��ʵ��
 
	void delete(Iterable<? extends T> entities); // ɾ��ʵ�弯��
 
	void deleteAll(); // ɾ������ʵ��
}
