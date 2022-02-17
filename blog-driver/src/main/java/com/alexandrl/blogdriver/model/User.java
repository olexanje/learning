package com.alexandrl.blogdriver.model;


import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "is_moderator")
    Integer isModerator;
    @Column(name = "reg_time")
    LocalDateTime regTime;
    @Column
    String name;
    @Column
    String email;
    @Column
    String password;
    @Column
    String code;
    @Column
    String photo;

    @OneToMany(mappedBy = "user")
    List<Post> userPosts;

    @OneToMany(mappedBy = "moderator")
    List<Post> postsForModeration;

    @ManyToMany(mappedBy = "userVotesList")
    List<PostVotes> postVotesList;

    @OneToMany(mappedBy = "user")
    List<PostComments> postCommentsList;
}
