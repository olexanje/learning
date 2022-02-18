package com.alexandrl.blogdriver.repository;

import com.alexandrl.blogdriver.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository  extends JpaRepository<Tag, Integer> {
}
