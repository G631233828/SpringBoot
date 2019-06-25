package gjb.mybatis.service.Impl;

import java.util.List;

import gjb.mybatis.pojo.Users;

public interface UsersService {

	public void addUser(Users users);
	
	public List<Users> findAllUser();
	
	public Users findUserById(Integer id);
	
	public void updateUser(Users users);
	
	public int delete(Integer id);
}
