package com.alexandrl.blogdriver.repository;

import com.alexandrl.blogdriver.model.PostComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCommentsRepository  extends JpaRepository<PostComments, Integer> {
}
