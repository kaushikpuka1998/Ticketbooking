package com.kgstrivers.TicketMasterBooking.models;

import com.kgstrivers.TicketMasterBooking.enums.BookStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class ShowSeat extends Seat{
    @Id
    private Long id;
    @ManyToOne
    private Show show;
    private double price;
    private BookStatus bookStatus;
    @OneToOne
    private Booking booking;
}
