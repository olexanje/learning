package com.alexandrl.blogdriver.model;


import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "post_comments")
@NoArgsConstructor
public class PostComments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "parent_id")
    Integer parentId;
    @Column(name = "post_id", nullable = false)
    Integer postId;
    @Column(name = "user_id", nullable = false)
    Integer userId;
    @Column(nullable = false)
    LocalDateTime time;
    @Column(nullable = false)
    String text;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    User user;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id", insertable = false, updatable = false)
    Post post;

    public User getUser() {
        return user;
    }

    public Post getPost() {
        return post;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
