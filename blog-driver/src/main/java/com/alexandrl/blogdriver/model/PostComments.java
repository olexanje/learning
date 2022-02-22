package com.alexandrl.blogdriver.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "post_comments")
@NoArgsConstructor
public class PostComments {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  @Column(name = "parent_id")
  Integer parentId;
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

  @Column(name = "post_id", nullable = false)
  public Integer getPostId() {
    return post.getId();
  }

  @Column(name = "user_id", nullable = false)
  public Integer getUserId() {
    return user.getId();
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

  public void setUser(User user) {
    this.user = user;
  }

  public void setPost(Post post) {
    this.post = post;
  }
}
