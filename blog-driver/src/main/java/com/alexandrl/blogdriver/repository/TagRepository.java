package com.alexandrl.blogdriver.repository;

import com.alexandrl.blogdriver.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository  extends JpaRepository<Tag, Integer> {
}
