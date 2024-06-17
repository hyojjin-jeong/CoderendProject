package com.sparta.fifteen.entity;

import com.sparta.fifteen.dto.CommentRequestDto;
import com.sparta.fifteen.dto.CommentResponseDto;

public interface CommentEntityTest extends UserEntityTest{
    Long TEST_COMMENT_ID = 1L;
    Long TEST_NEWSFEED_ID = 1L;
    String TEST_COMMENT_TEXT = "This is a comment";

    CommentRequestDto TEST_COMMENT_REQUEST_DTO = CommentRequestDto.builder()
            .comment(TEST_COMMENT_TEXT)
            .build();

    CommentResponseDto TEST_COMMENT_RESPONSE_DTO = CommentResponseDto.builder()
            .comment(TEST_COMMENT_TEXT)
            .build();

    Comment TEST_COMMENT = Comment.builder()
            .comment(TEST_COMMENT_TEXT)
            .build();

    Comment TEST_COMMENT_2 = Comment.builder()
            .comment(SECOND + TEST_COMMENT_TEXT)
            .build();
}
