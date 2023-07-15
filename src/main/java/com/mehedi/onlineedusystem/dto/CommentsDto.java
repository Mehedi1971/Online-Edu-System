package com.mehedi.onlineedusystem.dto;

import com.mehedi.onlineedusystem.model.Reacts;
import lombok.Data;

@Data
public class CommentsDto extends BaseDto{
    private String comment;
    private Reacts react;
}
