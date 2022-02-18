package com.alexandrl.blogdriver.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "tag2post")
@Data
@NoArgsConstructor
public class Tag2Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "post_id")
    Integer postId;
    @Column(name = "tag_id")
    Integer tagId;

    @ManyToOne
    @JoinColumn(name = "tag_id", referencedColumnName = "id", insertable = false, updatable = false)
    Tag tag;

    @ManyToMany
    @JoinColumn(name = "post_id", referencedColumnName = "id", insertable = false, updatable = false)
    List<Post> posts;
}
