package dev.umang.bookmyshowfeb25.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private String no;

    private TicketStatus ticketStatus;

    @ManyToOne
    private User user;

    private Long amount;

    @ManyToMany
    private List<ShowSeat> showSeats;

    @OneToMany
    private List<Payment> payments;
}

/*
Ticket Payment

Ticket User => M : 1
1       1
M       1

1------>M
M<--------1
Ticket ShowSeats => M : M

Ticket_id = 78
Show_id = 5, seat_id = 2
Show_id = 5, seat_id = 3 ----Cancelled

Ticket_id = 80
Show_id = 5, seat_id = 2


 */
