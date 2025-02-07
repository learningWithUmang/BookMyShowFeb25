package dev.umang.bookmyshowfeb25.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel{
    @ManyToOne
    private Show show;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    private Long price;
}

/*
ShowSeatType Show
1             1
M               1

showSeatType
show_id ,seat_type_id , status
2    , 5, available
2    , 6, booked
2,   , 7, available
 */
