package com.alexandrl.blogdriver.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "captcha_codes")
@NoArgsConstructor
public class CaptchaCodes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(nullable = false)
    LocalDateTime time;
    @Column(nullable = false)
    String code;
    @Column(nullable = false)
    String secret_code;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSecret_code() {
        return secret_code;
    }

    public void setSecret_code(String secret_code) {
        this.secret_code = secret_code;
    }
}
