package pe.edu.upc.managewise.issueservice.shared.infrastructure.interfaces.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponseDTO {
    private String error;
    private String message;
    public ErrorResponseDTO(String error, String message) {
        this.error = error;
        this.message = message;
    }
}
