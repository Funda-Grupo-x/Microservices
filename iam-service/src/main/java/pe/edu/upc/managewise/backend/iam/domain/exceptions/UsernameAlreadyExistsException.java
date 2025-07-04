package pe.edu.upc.managewise.backend.iam.domain.exceptions;

public class UsernameAlreadyExistsException extends RuntimeException {
    public UsernameAlreadyExistsException() { super("Username already exists"); }
}
