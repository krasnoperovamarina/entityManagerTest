package web.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;
@Repository
public interface UserDao {
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(int id);
}
