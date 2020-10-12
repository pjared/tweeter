package edu.byu.cs.tweeter.presenter;

import java.io.IOException;

import edu.byu.cs.tweeter.model.service.StatusService;
import edu.byu.cs.tweeter.model.service.request.StatusRequest;
import edu.byu.cs.tweeter.model.service.response.StatusResponse;

public class StatusPresenter {

    private final View view;

    /**
     * The interface by which this presenter communicates with it's view.
     */
    public interface View {
        // If needed, specify methods here that will be called on the view in response to model updates
    }

    /**
     * Creates an instance.
     *
     * @param view the view for which this class is the presenter.
     */
    public StatusPresenter(View view) {
        this.view = view;
    }

    /**
     * Makes a login request.
     *
     * @param statRequest the request.
     */
    public StatusResponse postStatus(StatusRequest statRequest){
        StatusService statService = new StatusService();
        return statService.postStatus(statRequest);
    }
}
