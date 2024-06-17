package com.sparta.fifteen.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CommentRequestDto {
    private String comment;
}
