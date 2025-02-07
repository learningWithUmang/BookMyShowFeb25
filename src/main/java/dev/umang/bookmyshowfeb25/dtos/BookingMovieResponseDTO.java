package dev.umang.bookmyshowfeb25.dtos;

import dev.umang.bookmyshowfeb25.models.Ticket;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingMovieResponseDTO {
    private Ticket ticket;
    private ResponseStatus responseStatus;
}
