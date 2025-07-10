package com.br.desafio.codecon.controller;

import com.br.desafio.codecon.entity.User;
import com.br.desafio.codecon.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @PostMapping
//    public User createUser(@RequestBody User user){
//        return userService.createUser(user);
//    }

    @PostMapping
    public ResponseEntity<List<User>> createUsers(@RequestBody List<User> users) {
        List<User> savedUsers = users.stream()
                .map(userService::createUser)
                .toList();
        return ResponseEntity.ok(savedUsers);
    }


    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    //Return with score greater than 900 and status equal than active
    @GetMapping("/filter/superusers")
    public List<User> getUsersWithHighScoreAndActive() {
        return userService.getUsersWithHighScoreAndActive();
    }

    @GetMapping("/filter/topcountries")
    public List<Object[]> findTop5CountriesWithMostSuperusers() {

        return userService.findTop5CountriesWithMostSuperusers();
    }

}
