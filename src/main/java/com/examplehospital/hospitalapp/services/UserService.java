package com.examplehospital.hospitalapp.services;

import com.examplehospital.hospitalapp.models.User;
import com.examplehospital.hospitalapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService() {}

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void createUser(User user){
        System.out.println("UserService: user =" + user);
        userRepository.save(user);

    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(int id){
        return userRepository.getById(id);
    }

    public User getUserByEmailAndPassword(String email, String password){
        return userRepository.getUserByEmailAndPassword(email, password);
    }

    public void updateUser(User user){
        userRepository.save(user);
    }

    public  void deleteUser(User user){
        userRepository.delete(user);
    }

}
