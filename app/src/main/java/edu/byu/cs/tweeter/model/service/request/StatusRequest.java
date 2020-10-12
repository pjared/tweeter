package edu.byu.cs.tweeter.model.service.request;

import edu.byu.cs.tweeter.model.domain.User;

public class StatusRequest {
    private final User poster;
    private final String statusMessage;

    public StatusRequest(User poster, String statusMessage) {
        this.poster = poster;
        this.statusMessage = statusMessage;
    }

    public User getPoster() {
        return poster;
    }

    public String getStatusMessage() {
        return statusMessage;
    }
}
