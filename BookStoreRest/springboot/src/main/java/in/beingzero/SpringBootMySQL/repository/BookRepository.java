package in.beingzero.SpringBootMySQL.repository;


import in.beingzero.SpringBootMySQL.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Page<Book> findAllByCategoryId(Integer id, Pageable pageable);
}
