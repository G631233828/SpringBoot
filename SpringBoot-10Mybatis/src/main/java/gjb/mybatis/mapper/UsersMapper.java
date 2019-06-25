package gjb.mybatis.mapper;

import java.util.List;

import gjb.mybatis.pojo.Users;

public interface UsersMapper {
	
	void insertUser(Users users);

	List<Users> findAllUser();
	
	Users findUserById(Integer id);
	
	void updateUser(Users users);
	
	int delete(Integer id);
}
