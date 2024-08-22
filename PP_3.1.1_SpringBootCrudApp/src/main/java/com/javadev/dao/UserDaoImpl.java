package com.javadev.dao;


import com.javadev.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User showUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUserById(int id) {
        User user =entityManager.find(User.class, id);
        entityManager.remove(user);
    }
}