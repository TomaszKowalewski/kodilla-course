package com.kodilla.patterns.strategy.social;

public class User {

    private final String userName;
    protected SocialPublisher socialPublisher;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String share(String post) {
        String result = "the post [" + post + "] shared on: " + socialPublisher.share();
        return result;
    }

    public void setSocialPublishingStrategy(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}