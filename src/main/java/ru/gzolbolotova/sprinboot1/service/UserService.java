package ru.gzolbolotova.sprinboot1.service;

import org.springframework.stereotype.Service;
import ru.gzolbolotova.sprinboot1.model.User;


import java.util.List;


public interface UserService {
    List<User> getUsers();

    User showUser(Long id);

    void deleteUser(Long id);

    void saveUser(User user);

    void updateUser(User user);
}
