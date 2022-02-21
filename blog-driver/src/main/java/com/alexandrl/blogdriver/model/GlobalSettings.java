package com.alexandrl.blogdriver.model;


import com.alexandrl.blogdriver.model.Unums.GlobalSettingsCode;
import com.alexandrl.blogdriver.model.Unums.GlobalSettingsValue;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
