package com.examplehospital.hospitalapp.repositories;

import com.examplehospital.hospitalapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User getUserByEmailAndPassword(String email, String password);
}