package com.mehedi.onlineedusystem.dto;

import com.mehedi.onlineedusystem.model.Comments;
import lombok.Data;

import java.util.List;

@Data
public class PostsDto extends BaseDto {
    private String post;
    private List<Comments> comments;
}
