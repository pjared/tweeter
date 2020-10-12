package edu.byu.cs.tweeter.model.service;

import java.io.IOException;

import edu.byu.cs.tweeter.model.domain.User;
import edu.byu.cs.tweeter.model.net.ServerFacade;
import edu.byu.cs.tweeter.model.service.request.StatusRequest;
import edu.byu.cs.tweeter.model.service.response.StatusResponse;

public class StatusService {
    public StatusResponse postStatus(StatusRequest request) {
        ServerFacade serverFacade = getServerFacade();
        StatusResponse statusResponse = serverFacade.postStatus(request);

        if(statusResponse.isSuccess()) {

        }
        return statusResponse;
    }

    ServerFacade getServerFacade() {
        return new ServerFacade();
    }
}
