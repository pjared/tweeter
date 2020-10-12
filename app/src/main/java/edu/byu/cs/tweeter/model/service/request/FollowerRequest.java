package edu.byu.cs.tweeter.model.service.request;

import edu.byu.cs.tweeter.model.domain.User;

public class FollowerRequest {
    private final User following;
    private final int limit;
    private final User lastFollowee;

    /**
     * Creates an instance.
     *
     * @param follower the {@link User} whose followees are to be returned.
     * @param limit the maximum number of followees to return.
     * @param lastFollowee the last followee that was returned in the previous request (null if
     *                     there was no previous request or if no followees were returned in the
     *                     previous request).
     */
    public FollowerRequest(User follower, int limit, User lastFollowee) {
        this.following = follower;
        this.limit = limit;
        this.lastFollowee = lastFollowee;
    }

    public User getFollowing() {
        return following;
    }

    public int getLimit() {
        return limit;
    }

    public User getLastFollowee() {
        return lastFollowee;
    }
}
