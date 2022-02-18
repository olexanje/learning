package com.alexandrl.blogdriver.model;


import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "posts")
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "is_active")
    Boolean isActive;
    @Column(name = "moderation_status")
    ModerationStatus moderationStatus = ModerationStatus.NEW;
    @Column(name = "moderator_id")
    Integer moderatorId;
    @Column(name = "user_id")
    Integer userId;
    @Column
    LocalDateTime time;
    @Column
    String title;
    @Column
    String text;
    @Column(name = "view_count")
    Integer viewCount;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    User user;

    @ManyToOne
    @JoinColumn(name = "moderator_id", referencedColumnName = "id", insertable = false, updatable = false)
    User moderator;

    @ManyToMany(mappedBy = "posts")
    List<Tag2Post> tag2PostList;

    @OneToMany(mappedBy = "post")
    List<PostVotes> postVotesList;

    @OneToMany(mappedBy = "post")
    List<PostComments> postCommentsList;

    public User getUser() {
        return user;
    }

    public User getModerator() {
        return moderator;
    }

    public List<Tag2Post> getTag2PostList() {
        return tag2PostList;
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

    public Integer getModeratorId() {
        return moderatorId;
    }

    public void setModeratorId(Integer moderatorId) {
        this.moderatorId = moderatorId;
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