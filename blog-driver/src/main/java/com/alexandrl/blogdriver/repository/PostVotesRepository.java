package com.alexandrl.blogdriver.repository;

import com.alexandrl.blogdriver.model.PostVotes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostVotesRepository extends JpaRepository<PostVotes, Integer> {
}
