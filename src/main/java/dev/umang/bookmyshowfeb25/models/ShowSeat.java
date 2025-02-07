package dev.umang.bookmyshowfeb25.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    private ShowSeatStatus showSeatStatus;
}

/*
ShowSeat Show
1 ---> 1
M  <----1
AB  A => ManyToOne
AB  B
 */