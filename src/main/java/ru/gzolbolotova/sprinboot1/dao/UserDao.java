package ru.gzolbolotova.sprinboot1.dao;

import ru.gzolbolotova.sprinboot1.model.User;


import java.util.List;


public interface UserDao {
    List<User> getUsers();

    User showUser(Long id);

    void deleteUser(Long id);

    void saveUser(User user);

    void updateUser(User user);
}
