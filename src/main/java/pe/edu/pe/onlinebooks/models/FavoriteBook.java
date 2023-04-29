@Entity
@Table(name = "favorite_books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteBook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    public String title;

    @Column(nullable = false)
    public String comment;

    @Column(nullable = false)
    public Integer rating;

    @Column(name = "created_at")
    public LocalDateTime createdAt;

    @Column(name = "updated_at")
    public LocalDateTime updatedAt;
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="book_id", nullable = false)
    private Book book;
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="user_id", nullable = false)
    private User user; }

