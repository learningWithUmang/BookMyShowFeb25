package dev.umang.bookmyshowfeb25.controllers;

import dev.umang.bookmyshowfeb25.dtos.BookingMovieRequestDTO;
import dev.umang.bookmyshowfeb25.dtos.BookingMovieResponseDTO;
import dev.umang.bookmyshowfeb25.dtos.ResponseStatus;
import dev.umang.bookmyshowfeb25.models.Ticket;
import dev.umang.bookmyshowfeb25.services.BookingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService){
        this.bookingService = bookingService;
    }

    @PostMapping("/book")
    public BookingMovieResponseDTO bookMovie(@RequestBody BookingMovieRequestDTO bookingMovieRequestDTO){
        BookingMovieResponseDTO bookingMovieResponseDTO = new BookingMovieResponseDTO();

        try {

            Ticket ticket = bookingService.bookMovie(bookingMovieRequestDTO.getUserId(),
                    bookingMovieRequestDTO.getShowId(),
                    bookingMovieRequestDTO.getShowSeatsIds());

            bookingMovieResponseDTO.setTicket(ticket);
            bookingMovieResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex){
            bookingMovieResponseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }

        return bookingMovieResponseDTO;
    }
}
