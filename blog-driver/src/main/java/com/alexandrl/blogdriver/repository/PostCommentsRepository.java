package com.alexandrl.blogdriver.repository;

import com.alexandrl.blogdriver.model.Post;
import com.alexandrl.blogdriver.model.PostComments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCommentsRepository  extends JpaRepository<PostComments, Integer> {
}
