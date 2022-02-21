package com.alexandrl.blogdriver.repository;

import com.alexandrl.blogdriver.model.PostVotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostVotesRepository extends JpaRepository<PostVotes, Integer> {
}
