package dev.umang.bookmyshowfeb25.dtos;

import dev.umang.bookmyshowfeb25.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupResponseDTO {
    private User user;
    private ResponseStatus responseStatus;
}
