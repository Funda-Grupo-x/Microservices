package pe.edu.upc.managewise.backend.iam.interfaces.exceptions;

import pe.edu.upc.managewise.backend.iam.domain.exceptions.InvalidPasswordException;
import pe.edu.upc.managewise.backend.iam.domain.exceptions.InvalidRoleException;
import pe.edu.upc.managewise.backend.iam.domain.exceptions.UserNotFoundException;
import pe.edu.upc.managewise.backend.iam.domain.exceptions.UsernameAlreadyExistsException;
import pe.edu.upc.managewise.backend.shared.infrastructure.interfaces.responses.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class IamExceptionsHandler {
    @ExceptionHandler(UsernameAlreadyExistsException.class)
    public ResponseEntity<ErrorResponseDTO> handleUsernameAlreadyExistsException(UsernameAlreadyExistsException e) {
        ErrorResponseDTO errorResponse = new ErrorResponseDTO("Username Already Exists", e.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidRoleException.class)
    public ResponseEntity<ErrorResponseDTO> handleRoleNotFoundException(InvalidRoleException e) {
        ErrorResponseDTO errorResponse = new ErrorResponseDTO("Role Not Found", e.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InvalidPasswordException.class)
    public ResponseEntity<ErrorResponseDTO> handleInvalidPasswordException(InvalidPasswordException e) {
        ErrorResponseDTO errorResponse = new ErrorResponseDTO("Invalid Password", e.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleUserNotFoundException(UserNotFoundException e) {
        ErrorResponseDTO errorResponse = new ErrorResponseDTO("User Not Found", e.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
