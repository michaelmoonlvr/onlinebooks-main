package pe.edu.pe.onlinebooks.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.pe.onlinebooks.models.Book;
import pe.edu.pe.onlinebooks.repositories.BookRepository;
import pe.edu.pe.onlinebooks.services.BookService;

import java.time.LocalDateTime;

@Service
public class BookServiceImpl implements BookService {
    final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override public Book addBook(String title, String author, String description, MultipartFile image) {
        Book book = new Book(title, author, description, "", LocalDateTime.now(), LocalDateTime.now());
        return bookRepository.save(book);
    }
    BookService
    @Service
        public BookServiceImpl(BookRepository bookRepository) {
            this.bookRepository = bookRepository;
        }
        @Override
        public List<Book> getAllBooks() {
            return bookRepository.findAll();
        }
        @Override
        public Book getBookById(Long id) {
            return bookRepository.findById(id).orElseThrow(() -> new
                    EntityNotFoundException("Libro no encontrado"+ "id:  " + id));
        }
        @Override
        public Book addBook(Book book) {
            return bookRepository.save(book);
        }
        @Override
        public Book updateBook(Long id, Book bookDetails) {
            Book book = getBookById(id);
            book.setTitle(bookDetails.getTitle());
            book.setAuthor(bookDetails.getAuthor());
            book.setDescription(bookDetails.getDescription());
            book.setImageUrl(bookDetails.getImageUrl());
            book.setUpdatedAt(LocalDateTime.now());
            return bookRepository.save(book);
        }
        @Override
        public void deleteBook(Long id) {
            bookRepository.delete(getBookById(id));
        }
    }
}
