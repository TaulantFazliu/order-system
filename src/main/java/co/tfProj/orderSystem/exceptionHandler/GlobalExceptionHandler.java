package co.tfProj.orderSystem.exceptionHandler;

import co.tfProj.orderSystem.user.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({UserNotFoundException.class})
    public ResponseEntity<ApiError> userNotFound(UserNotFoundException us) {
        ApiError userException = new ApiError();
        userException.setMessage(us.getMessage());
        userException.setStatusCode(HttpStatus.NOT_FOUND.value());

        return new ResponseEntity<>(userException, HttpStatus.NOT_FOUND);
    }


}
