package com.url.shortner.service;

import com.url.shortner.models.User;
import com.url.shortner.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserService {


    private PasswordEncoder passwordEncoder;

    private UserRepository userRepository;
    public void registerUser(User user){

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    public User findByUsername(String name) {
        return userRepository.findByUsername(name).orElseThrow(
                () -> new UsernameNotFoundException("User not found with username: " + name)
        );
    }
}
