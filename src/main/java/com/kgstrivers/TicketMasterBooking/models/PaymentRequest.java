package com.kgstrivers.TicketMasterBooking.models;

import lombok.Data;

@Data
public class PaymentRequest {
    Booking booking;
    Show show;
    User user;
    int numberOfTickets;
    String paymentMethod;
}
