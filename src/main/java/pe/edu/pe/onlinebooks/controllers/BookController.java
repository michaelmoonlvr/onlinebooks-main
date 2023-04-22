package pe.edu.pe.onlinebooks.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pe.edu.pe.onlinebooks.models.Book;
import pe.edu.pe.onlinebooks.services.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> addBook(@RequestParam String title,
                                        @RequestParam String author,
                                        @RequestParam String description,
                                        @RequestParam MultipartFile image) {
        Book newBook = bookService.addBook(title, author, description, image);
        return ResponseEntity.ok(newBook);
    }
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
    }
    @RestController
    @RequestMapping("/api/auth")
    public class AuthController {
        private final UserService userService;
        public AuthController(UserService userService) {
            this.userService = userService;
        }
        @PostMapping("/register")
        public ResponseEntity<User> register(@RequestParam String username,
                                             @RequestParam String password, @RequestParam String email) {
            User newUser = userService.register(username, password, email);
            return ResponseEntity.ok(newUser);
        }
        @PostMapping("/login")
        public ResponseEntity<User> login(@RequestParam String username,
                                          @RequestParam String password) {
            User user = userService.login(username, password);
            return ResponseEntity.ok(user);
        }

}

