package com.onlinerestaurant.restaurant.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.onlinerestaurant.restaurant.database.models.User;
import com.onlinerestaurant.restaurant.database.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    
    private final UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    /**
     * Save a new user in DB
     * @param firstName
     * @param lastName
     * @param email
     * @param password
     * @return
     */
    public User save(String firstName, String lastName, String email, String password){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPassword(this.passwordEncoder.encode(password));
        return this.userRepository.save(user);
    }
    
}
