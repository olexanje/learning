package com.alexandrl.blogdriver.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "post_votes")
@NoArgsConstructor
public class PostVotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "user_id", nullable = false)
    Integer userId;
    @Column(name = "post_id", nullable = false)
    Integer postId;
    @Column(nullable = false)
    LocalDateTime time;
    @Column(nullable = false)
    Byte value;

    @ManyToMany
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    List<User> userVotesList;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id", insertable = false, updatable = false)
    Post post;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Byte getValue() {
        return value;
    }

    public void setValue(Byte value) {
        this.value = value;
    }

    public List<User> getUserVotesList() {
        return userVotesList;
    }

    public Post getPost() {
        return post;
    }
}
