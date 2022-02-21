package com.alexandrl.blogdriver.service;

import com.alexandrl.blogdriver.dto.PostDto;
import com.alexandrl.blogdriver.dto.UserDto;
import com.alexandrl.blogdriver.model.Post;
import com.alexandrl.blogdriver.model.User;
import com.alexandrl.blogdriver.repository.PostCommentsRepository;
import com.alexandrl.blogdriver.repository.PostRepository;
import com.alexandrl.blogdriver.repository.PostVotesRepository;
import com.alexandrl.blogdriver.repository.UserRepository;
import com.alexandrl.blogdriver.service.exceptions.ValidateUserException;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log
@Service
public class PostService {

    @Autowired
    PostRepository postRepository;
    @Autowired
    PostCommentsRepository commentsRepository;
    @Autowired
    PostVotesRepository votesRepository;
    @Autowired
    UserRepository userRepository;

    public long getPostsCount() {
        if (postRepository == null) {
            return 0;
        }
        return postRepository.count();
    }

    public List<PostDto> getAllPost() {
        if (postRepository == null) {
            return new ArrayList<>();
        }

        List<Post> postList = postRepository.findAll();
        List<PostDto> postDtoList = new ArrayList<>();
        postList.forEach(post -> postDtoList.add(convertPostToPostDto(post)));
        return postDtoList;
    }




    private PostDto convertPostToPostDto(Post post) {
        UserDto userDto = convertUserToUserDto(userRepository.findById(post.getUserId()));
        Integer likeCount = (int) post.getPostVotesList().stream().filter(postVotes -> postVotes.getValue() > 0).count();
        Integer dislikeCount = post.getPostVotesList().size() - likeCount;
        Integer commentCount = post.getPostCommentsList().size();
        return new PostDto(
                post.getId(),
                post.getTime(),
                userDto,
                post.getTitle(),
                getAnnounce(post.getText()),
                likeCount,
                dislikeCount,
                commentCount,
                post.getViewCount()
        );
    }

    private UserDto convertUserToUserDto(Optional<User> optionalUser) {
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            return new UserDto(user.getId(), user.getName());
        } else {
            throw new ValidateUserException("No user find for convert to userDto");
        }
    }

    private String getAnnounce(String text) {
        return text.substring(0, text.indexOf(" ", 100)) + "...";
    }
}