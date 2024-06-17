package com.sparta.fifteen.entity;

public interface UserEntityTest {
    String SECOND = "Second";
    Long TEST_USER_ID = 1L;
    Long TEST_USER_ID_2 = 2L;
    String TEST_USER_NAME = "username";
    String TEST_USER_PASSWORD = "Abcde1234!";
    User TEST_USER = User.builder()
            .username(TEST_USER_NAME)
            .password(TEST_USER_PASSWORD)
            .build();
    User TEST_USER_2 = User.builder()
            .username(SECOND + TEST_USER_NAME)
            .password(SECOND + TEST_USER_PASSWORD)
            .build();
}
