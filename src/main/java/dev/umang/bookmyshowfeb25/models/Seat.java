package dev.umang.bookmyshowfeb25.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Seat extends BaseModel{
    private String no;
    private SeatType seatType;

}
