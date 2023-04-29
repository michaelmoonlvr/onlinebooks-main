public interface FavoriteBookService {
FavoriteBook addFavoriteBook(Long bookId; Long userId);
List<Book> getFavoritesBooksByUserId(Long userId);
void removeFavoriteBook(Long bookId, Long userId);

}