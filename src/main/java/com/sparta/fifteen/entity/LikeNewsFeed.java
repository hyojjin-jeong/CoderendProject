package com.sparta.fifteen.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class LikeNewsFeed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "likeN_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "newsfeed_id")
    private NewsFeed newsfeed;

    public LikeNewsFeed(User user, NewsFeed newsfeed) {
        this.user = user;
        this.newsfeed = newsfeed;
    }
}