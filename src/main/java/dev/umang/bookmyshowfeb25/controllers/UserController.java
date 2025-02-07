package dev.umang.bookmyshowfeb25.controllers;

import dev.umang.bookmyshowfeb25.dtos.ResponseStatus;
import dev.umang.bookmyshowfeb25.dtos.SignUpRequestDTO;
import dev.umang.bookmyshowfeb25.dtos.SignupResponseDTO;
import dev.umang.bookmyshowfeb25.models.User;
import dev.umang.bookmyshowfeb25.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    public SignupResponseDTO singup(SignUpRequestDTO signUpRequestDTO){
        SignupResponseDTO signupResponseDTO = new SignupResponseDTO();
        try{
            User user = userService.signup(signUpRequestDTO.getName(),
                    signUpRequestDTO.getEmail(),
                    signUpRequestDTO.getPassword());

            signupResponseDTO.setUser(user);
            signupResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception ex){
            signupResponseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }

        return signupResponseDTO;
    }
}
