package edu.byu.cs.tweeter.model.service.response;

import edu.byu.cs.tweeter.model.domain.AuthToken;
import edu.byu.cs.tweeter.model.domain.User;

public class StatusResponse extends Response {

    private User user;
    //private AuthToken authToken;// need an authtoken to post a status? prob

    public RegisterResponse(String message) {
        super(false, message);
    }

    public RegisterResponse(User user) {
        super(true, null);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

}
