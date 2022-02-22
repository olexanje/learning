package com.alexandrl.blogdriver.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tags")
@NoArgsConstructor
public class Tag {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  @Column(nullable = false)
  String name;

  @ManyToMany(mappedBy = "tagList")
  List<Post> postList;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Post> getPostList() {
    return postList;
  }
}
