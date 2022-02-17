package com.alexandrl.blogdriver.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "post_comments")
@Data
@NoArgsConstructor
public class PostComments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "parent_id")
    Integer parentId;
    @Column(name = "post_id")
    Integer postId;
    @Column(name = "user_id")
    Integer userId;
    @Column
    LocalDateTime time;
    @Column
    String text;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    User user;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id", insertable = false, updatable = false)
    Post post;
}
