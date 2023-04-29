package pe.edu.pe.onlinebooks.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pe.edu.pe.onlinebooks.models.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Integer> {
    public interface BookRepository extends JpaRepository<Book, Long> {
        @Query("SELECT b, AVG(r.rating) FROM Book b LEFT JOIN b.reviews r
                GROUP BY b.id")
                List<Object[]> findBooksWithAvgRating();@Repository

    }

}