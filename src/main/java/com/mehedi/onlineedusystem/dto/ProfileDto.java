package com.mehedi.onlineedusystem.dto;

import com.mehedi.onlineedusystem.model.Comments;
import com.mehedi.onlineedusystem.model.Posts;
import lombok.Data;

import java.util.List;


@Data
public class ProfileDto extends BaseDto {
    private String name;
    private String email;
    private String description;
    private List<Comments> comments;
    private List<Posts> posts;
}
