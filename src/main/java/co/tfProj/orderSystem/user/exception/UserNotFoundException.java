package co.tfProj.orderSystem.user.exception;

public class UserNotFoundException extends Exception {

    public UserNotFoundException(String username) {
        super("User not found for username:" + username);
    }
}
