package com.alexandrl.blogdriver.repository;

import com.alexandrl.blogdriver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Integer> {
}
