package dev.umang.bookmyshowfeb25.dtos;

import dev.umang.bookmyshowfeb25.models.ShowSeat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookingMovieRequestDTO { //payload to be received in the booking request
    private Long userId;
    private List<Long> showSeatsIds;
    private Long showId;
}
