package gjb.ehcache.repository;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface CrudRepository<T, ID extends Serializable> extends Repository<T, ID> {
 
	<S extends T> S save(S entity); // 保存并返回（修改后的）实体
 
	<S extends T> Iterable<S> save(Iterable<S> entities); // 保存并返回（修改后的）实体集合
 
	T findOne(ID id); // 根据ID获取实体
 
	boolean exists(ID id); // 判断指定ID的实体是否存在
 
	Iterable<T> findAll(); // 查询所有实体
 
	Iterable<T> findAll(Iterable<ID> ids); // 根据ID集合查询实体
 
	long count(); // 获取实体的数量
 
	void delete(ID id); // 删除指定ID的实体
 
	void delete(T entity); // 删除实体
 
	void delete(Iterable<? extends T> entities); // 删除实体集合
 
	void deleteAll(); // 删除所有实体
}
