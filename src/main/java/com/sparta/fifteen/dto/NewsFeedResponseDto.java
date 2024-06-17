package com.sparta.fifteen.dto;

import com.sparta.fifteen.entity.NewsFeed;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewsFeedResponseDto {
    private Long id;
    private Long authorId;
    private String content;

    public NewsFeedResponseDto(NewsFeed newsFeed) {
        this.id=newsFeed.getId();
        this.authorId=newsFeed.getAuthorId();
        this.content=newsFeed.getContent();
    }
}
