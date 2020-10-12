package edu.byu.cs.tweeter.model.service.response;

import java.util.List;
import java.util.Objects;

import edu.byu.cs.tweeter.model.domain.User;

public class FollowerResponse extends PagedResponse {

    private List<User> followers;

    public FollowerResponse(String message) {
        super(false, message, false);
    }

    public FollowerResponse(List<User> followees, boolean hasMorePages) {
        super(true, hasMorePages);
        this.followers = followees;
    }

    public List<User> getFollowees() {
        return followers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FollowerResponse that = (FollowerResponse) o;
        return Objects.equals(followers, that.followers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(followers);
    }
}

