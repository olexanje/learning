package com.alexandrl.blogdriver.model;

import com.alexandrl.blogdriver.model.Unums.ModerationStatus;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

/**
 * Post Entity styled by google checks
 */
@Entity
@Table(name = "posts")
@NoArgsConstructor
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  @Column(name = "is_active", nullable = false)
  Boolean isActive;
  @Enumerated(EnumType.STRING)
  @Column(name = "moderation_status", nullable = false)
  ModerationStatus moderationStatus;
  @Column(nullable = false)
  LocalDateTime time;
  @Column(nullable = false)
  String title;
  @Column(nullable = false)
  String text;
  @Column(name = "view_count", nullable = false)
  Integer viewCount;
  /** Mapping to user */
  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id",
      insertable = false, updatable = false)
  User user;
  /** Mapping to moderator */
  @ManyToOne
  @JoinColumn(name = "moderator_id", referencedColumnName = "id",
      insertable = false, updatable = false)
  User moderator;
  /** Mapping to Tag via tag2post */
  @ManyToMany(cascade = {
      CascadeType.PERSIST,
      CascadeType.MERGE
  })
  @JoinTable(name = "tag2post",
      joinColumns = @JoinColumn(name = "post_id"),
      inverseJoinColumns = @JoinColumn(name = "tag_id")
  )
  List<Tag> tagList;
  @OneToMany(mappedBy = "post")
  List<PostVotes> postVotesList;
  @OneToMany(mappedBy = "post")
  List<PostComments> postCommentsList;

  @Column(name = "user_id", nullable = false)
  public Integer getUserId() {
    return user.getId();
  }

  @Column(name = "moderator_id")
  public Integer getModeratorId() {
    return moderator.getId();
  }

  public void setUser(User user) {
    this.user = user;
  }

  public User getUser() {
    return user;
  }

  public User getModerator() {
    return moderator;
  }

  public List<Tag> getTagList() {
    return tagList;
  }

  public List<PostVotes> getPostVotesList() {
    return postVotesList;
  }

  public List<PostComments> getPostCommentsList() {
    return postCommentsList;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Boolean getActive() {
    return isActive;
  }

  public void setActive(Boolean active) {
    isActive = active;
  }

  public ModerationStatus getModerationStatus() {
    return moderationStatus;
  }

  public void setModerationStatus(ModerationStatus moderationStatus) {
    this.moderationStatus = moderationStatus;
  }

  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Integer getViewCount() {
    return viewCount;
  }

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }
}