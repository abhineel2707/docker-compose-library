package in.beingzero.SpringBootMySQL.repository;

import in.beingzero.SpringBootMySQL.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
