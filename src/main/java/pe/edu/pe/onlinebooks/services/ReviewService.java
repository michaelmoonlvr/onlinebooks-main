public interface ReviewService {
    Review createReview(Review review, Long bookId, Long userId);
    List<Review> getReviewByBookId(Long bookId);
    Review getReviewByBookIdAndUserId(Long bookId, Long userId);
    void deleteReview(Long id);

}