package com.alexandrl.blogdriver.service;

import com.alexandrl.blogdriver.model.Post;
import com.alexandrl.blogdriver.repository.PostCommentsRepository;
import com.alexandrl.blogdriver.repository.PostRepository;
import com.alexandrl.blogdriver.repository.PostVotesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    PostRepository postRepository;
    PostCommentsRepository commentsRepository;
    PostVotesRepository votesRepository;

    public long getPostsCount() {
        return postRepository.count();
    }

    public List<Post> getAllPost() {
        return postRepository.findAll();
    }




}
