package com.alexandrl.blogdriver.repository;

import com.alexandrl.blogdriver.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
