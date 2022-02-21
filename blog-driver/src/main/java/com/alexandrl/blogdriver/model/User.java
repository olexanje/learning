package com.alexandrl.blogdriver.model;


import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "is_moderator", nullable = false)
    Boolean isModerator;
    @Column(name = "reg_time", nullable = false)
    LocalDateTime regTime;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String email;
    @Column(nullable = false)
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

    public List<Post> getUserPosts() {
        return userPosts;
    }

    public List<Post> getPostsForModeration() {
        return postsForModeration;
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

    public Boolean getModerator() {
        return isModerator;
    }

    public void setModerator(Boolean moderator) {
        isModerator = moderator;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public void setRegTime(LocalDateTime regTime) {
        this.regTime = regTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
