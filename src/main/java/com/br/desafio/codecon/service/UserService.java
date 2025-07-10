package com.br.desafio.codecon.service;

import com.br.desafio.codecon.entity.User;
import com.br.desafio.codecon.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(com.br.desafio.codecon.repository.UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<User> getUsersWithHighScoreAndActive() {
        return userRepository.findByScoreGreaterThanEqualAndActiveTrue(900);
    }

    public List<Object[]> findTop5CountriesWithMostSuperusers() {
        return userRepository.findTop5CountriesWithMostSuperusers();
    }
}
