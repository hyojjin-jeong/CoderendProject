package com.sparta.fifteen.entity;

import com.sparta.fifteen.dto.NewsFeedRequestDto;
import com.sparta.fifteen.dto.NewsFeedResponseDto;

public interface NewFeedEntityTest extends UserEntityTest{
    Long TEST_FEED_ID = 1L;
    String TEST_FEED_CONTENT = "This is a test feed";

    NewsFeedRequestDto TEST_FEED_REQUEST_DTO = NewsFeedRequestDto.builder()
            .content(TEST_FEED_CONTENT)
            .build();
    NewsFeedResponseDto TEST_FEED_RESPONSE_DTO = NewsFeedResponseDto.builder()
            .content(TEST_FEED_CONTENT)
            .build();

    NewsFeed TEST_FEED = NewsFeed.builder()
            .content(TEST_FEED_CONTENT)
            .build();

    NewsFeed TEST_FEED_2 = NewsFeed.builder()
            .content(SECOND + TEST_FEED_CONTENT)
            .build();
}
