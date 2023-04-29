package pe.edu.pe.onlinebooks.services;

import org.springframework.web.multipart.MultipartFile;
import pe.edu.pe.onlinebooks.models.Book;

public interface BookService {
    Book createBook(Book book);
    Book getBookById(Long id);
    List<Book> getAllBooks();
    Book updateBook(Long id , Book book);
    void deleteBook(Long id);
    List<Book> searchBooks(String keyword);

}