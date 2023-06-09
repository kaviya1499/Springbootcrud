package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.repository.UserRepository;

import java.util.List;

import org.springframework.stereotype.Component;

public interface UserService {
	User save(User user);
	User getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Long userId);
}