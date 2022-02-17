package com.alexandrl.blogdriver.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "posts")
@Data
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
    @Column(name = "viewCount")
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

}
