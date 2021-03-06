package com.example.social.Service;

import com.example.social.Entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Map;

public interface UserService extends UserDetailsService {
    User findByUsername(String username);
    User save(User user);
    List<User> getUsers();
    boolean addUser(User user);
    boolean activateUser(String code);

    void saveUser(User user, String username, Map<String, String> form);

    void updateProfile(User user, String password, String email);

    void subscribe(User currentUser, User user);

    void unsubscribe(User currentUser, User user);
}
