package dev.umang.bookmyshowfeb25.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Ticket extends BaseModel{
    private String no;
    private TicketStatus ticketStatus;
    private User user;
    private Long amount;
    private List<ShowSeat> showSeats;
    private List<Payment> payments;
}
