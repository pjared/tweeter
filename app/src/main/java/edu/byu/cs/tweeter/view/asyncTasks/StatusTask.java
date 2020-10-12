package edu.byu.cs.tweeter.view.asyncTasks;

import android.util.Log;

import java.io.IOException;

import edu.byu.cs.tweeter.model.domain.User;
import edu.byu.cs.tweeter.model.service.request.StatusRequest;
import edu.byu.cs.tweeter.model.service.response.StatusResponse;
import edu.byu.cs.tweeter.util.ByteArrayUtils;

public class StatusTask {

    private final StatusPresenter presenter;
    private final Observer observer;
    private Exception exception;

    /**
     * An observer interface to be implemented by observers who want to be notified when this task
     * completes.
     */
    public interface Observer {
        void loginSuccessful(StatusResponse loginResponse);
        void loginUnsuccessful(StatusResponse loginResponse);
        void handleException(Exception ex);
    }

    /**
     * Creates an instance.
     *
     * @param presenter the presenter this task should use to login.
     * @param observer the observer who wants to be notified when this task completes.
     */
    public StatusTask(StatusPresenter presenter, LoginTask.Observer observer) {
        if(observer == null) {
            throw new NullPointerException();
        }

        this.presenter = presenter;
        this.observer = observer;
    }
    
    @Override
    protected StatusResponse doInBackground(StatusRequest... StatusRequests) {
        StatusResponse statResponse = null;

        try {
            statResponse = presenter.postStatus(StatusRequests[0]);
        } catch (IOException ex) {
            exception = ex;
        }

        return statResponse;
    }
    
    /**
     * Notifies the observer (on the thread of the invoker of the
     * {@link #execute(LoginRequest...)} method) when the task completes.
     *
     * @param statResponse the response that was received by the task.
     */
    @Override
    protected void onPostExecute(StatusResponse statResponse) {
        if(exception != null) {
            observer.handleException(exception);
        } else if(statResponse.isSuccess()) {
            observer.loginSuccessful(statResponse);
        } else {
            observer.loginUnsuccessful(statResponse);
        }
    }
}
