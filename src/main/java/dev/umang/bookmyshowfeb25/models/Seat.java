package dev.umang.bookmyshowfeb25.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String no;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

}
