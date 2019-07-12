package gjb.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import gjb.jpa.pojo.User;

public interface UserRepositoryByJPASpecificationExecutor extends JpaRepository<User, Integer> , JpaSpecificationExecutor<User> {

}
