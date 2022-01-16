package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.*;
import java.util.List;
@Component
@ComponentScan("web")
public class UserDaoImpl implements UserDao{


    EntityManager entityManager;
    @Autowired
    public UserDaoImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
}
    @Transactional
    public List<User> getAllUsers() {
    return entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
    }

  @Transactional
    public void saveUser(User user) {
    entityManager.persist(user);
    }

    @Transactional
    public void deleteUser(int id) {
    entityManager.find(User.class, new int[id]);
    }
}
