package com.alexandrl.blogdriver.model;

import com.alexandrl.blogdriver.model.enums.GlobalSettingsCode;
import com.alexandrl.blogdriver.model.enums.GlobalSettingsValue;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "global_settings")
@NoArgsConstructor
public class GlobalSettings {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  GlobalSettingsCode code;
  @Column(nullable = false)
  String name;
  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  GlobalSettingsValue value;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GlobalSettingsCode getCode() {
    return code;
  }

  public void setCode(GlobalSettingsCode code) {
    this.code = code;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GlobalSettingsValue getValue() {
    return value;
  }

  public void setValue(GlobalSettingsValue value) {
    this.value = value;
  }
}
