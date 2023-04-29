package com.onlinerestaurant.restaurant.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.onlinerestaurant.restaurant.adapter.MyUserPrincipal;
import com.onlinerestaurant.restaurant.database.models.User;
import com.onlinerestaurant.restaurant.database.repositories.UserRepository;
import com.onlinerestaurant.restaurant.enums.UserRoles;
import com.onlinerestaurant.restaurant.interfaces.Constants;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService implements UserDetailsService {
    
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
        user.setRole(UserRoles.USER.toString());
        return this.userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        return this.userRepository.findByEmail(username)
            .map(user -> new MyUserPrincipal(user))
            .orElseThrow(()-> new UsernameNotFoundException(Constants.ERR_EMAIL_NOT_FOUND));
    }
    
}
