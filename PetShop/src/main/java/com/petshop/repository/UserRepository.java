package com.petshop.repository;
import com.petshop.model.User;import org.springframework.data.jpa.repository.JpaRepository;import java.util.*;
public interface UserRepository extends JpaRepository<User,Long>{Optional<User> findByUsername(String u);} 