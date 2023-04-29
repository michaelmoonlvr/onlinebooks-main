public interface UserService
{   User createUser (User user);
    User getUserById(Long id);
    User getUserByName(String username);
    User updateUser(Long id, User user);
    void DeleteUser(Long id)
;
}