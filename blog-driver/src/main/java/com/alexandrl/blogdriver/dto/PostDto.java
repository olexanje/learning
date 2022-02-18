package com.alexandrl.blogdriver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    Integer id;
    LocalDateTime timestamp;
    UserDto userDto;
    String title;
    String announce;
    Integer likeCount;
    Integer dislikeCount;
    Integer commentCount;
    Integer viewCount;
}
