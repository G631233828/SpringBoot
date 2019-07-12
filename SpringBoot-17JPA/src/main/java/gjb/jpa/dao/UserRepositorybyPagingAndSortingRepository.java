package gjb.jpa.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import gjb.jpa.pojo.User;

public interface UserRepositorybyPagingAndSortingRepository extends PagingAndSortingRepository<User, Integer> {

}
