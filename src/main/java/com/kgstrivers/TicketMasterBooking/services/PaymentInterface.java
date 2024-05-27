package com.kgstrivers.TicketMasterBooking.services;


import com.kgstrivers.TicketMasterBooking.models.Booking;
import com.kgstrivers.TicketMasterBooking.models.Payment;
import com.kgstrivers.TicketMasterBooking.models.Show;
import com.kgstrivers.TicketMasterBooking.models.User;

public interface PaymentInterface {
    public Payment pay(Booking booking, Show show, User user, int numberOfTickets, String paymentMethod);
}
