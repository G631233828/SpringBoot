package gjb.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gjb.mybatis.mapper.UsersMapper;
import gjb.mybatis.pojo.Users;
import gjb.mybatis.service.Impl.UsersService;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersMapper usersMapper;

	public void addUser(Users users) {
		this.usersMapper.insertUser(users);
		
	}

	public List<Users> findAllUser() {
		return this.usersMapper.findAllUser();
	}

	public Users findUserById(Integer id) {
		return this.usersMapper.findUserById(id);
	}

	public void updateUser(Users users) {
		 this.usersMapper.updateUser(users);
	}
	
	public int delete(Integer id){
		return this.usersMapper.delete(id);
	}
	
	
	
	
}
