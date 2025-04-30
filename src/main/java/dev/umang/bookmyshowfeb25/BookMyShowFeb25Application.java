package dev.umang.bookmyshowfeb25;

import dev.umang.bookmyshowfeb25.controllers.UserController;
import dev.umang.bookmyshowfeb25.dtos.SignUpRequestDTO;
import dev.umang.bookmyshowfeb25.dtos.SignupResponseDTO;
import dev.umang.bookmyshowfeb25.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowFeb25Application implements CommandLineRunner {

    @Autowired
    private UserController userController;

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowFeb25Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SignUpRequestDTO signUpRequestDTO = new SignUpRequestDTO();
        signUpRequestDTO.setEmail("uabcs123ed.13@gmailcom");
        signUpRequestDTO.setName("swdcfkc dwjc");
        signUpRequestDTO.setPassword("ABCD@sqwdeckjmws");

        SignupResponseDTO signupResponseDTO = userController.signup(signUpRequestDTO);

        System.out.println(signupResponseDTO);
        //System.out.println("Testing the appn");
    }
}

//audit basically means a record
