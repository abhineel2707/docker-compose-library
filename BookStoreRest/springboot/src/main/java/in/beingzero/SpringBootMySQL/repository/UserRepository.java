package in.beingzero.SpringBootMySQL.repository;

import in.beingzero.SpringBootMySQL.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
    List<Users> findByUsername(String username);
}
