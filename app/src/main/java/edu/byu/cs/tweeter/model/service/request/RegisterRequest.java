package edu.byu.cs.tweeter.model.service.request;

public class RegisterRequest {
    private final String username;
    private final String password;
    private final String image;

    /**
     * Creates an instance.
     *
     * @param username the username of the user to be logged in.
     * @param password the password of the user to be logged in.
     */
    public RegisterRequest(String username, String password, String img) {
        this.username = username;
        this.password = password;
        this.image = img;
    }

    /**
     * Returns the username of the user to be logged in by this request.
     *
     * @return the username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns the password of the user to be logged in by this request.
     *
     * @return the password.
     */
    public String getPassword() {
        return password;
    }

    public String getImage() {
        return image;
    }
}
