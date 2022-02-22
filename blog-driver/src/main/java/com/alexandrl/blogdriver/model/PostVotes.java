package com.alexandrl.blogdriver.model;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "post_votes")
@NoArgsConstructor
public class PostVotes {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  @Column(name = "user_id", nullable = false)
  Integer userId;
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

  @Column(name = "post_id", nullable = false)
  public Integer getPostId() {
    return post.getId();
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

  public void setPost(Post post) {
    this.post = post;
  }
}
