package dev.umang.bookmyshowfeb25.services;

import dev.umang.bookmyshowfeb25.models.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    public Ticket bookMovie(Long userId,
                            Long showId,
                            List<Long> showSeatIds){
        Ticket ticket = new Ticket();
        return ticket;
    }
}
