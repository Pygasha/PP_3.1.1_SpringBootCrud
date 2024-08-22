package com.javadev.services;



import com.javadev.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    public void saveUser(User user);
    public User showUserById(int id);
    public void deleteUserById(int id);

}
