package dev.umang.bookmyshowfeb25.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private Long amount;

    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;
    private Long reference_id;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
}
