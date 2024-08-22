package com.javadev.services;


import com.javadev.dao.UserDao;
import com.javadev.models.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User showUserById(int id) {
        return userDao.showUserById(id);
    }

    @Override
    @Transactional
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }

}

