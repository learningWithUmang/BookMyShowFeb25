package dev.umang.bookmyshowfeb25.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel{
    private Long amount;
    private PaymentMode paymentMode;
    private Long reference_id;
    private PaymentStatus paymentStatus;
}
