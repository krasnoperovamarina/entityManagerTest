package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(int id);

}
