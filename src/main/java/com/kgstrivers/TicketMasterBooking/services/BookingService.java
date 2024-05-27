package com.kgstrivers.TicketMasterBooking.services;

import com.kgstrivers.TicketMasterBooking.models.Booking;
import com.kgstrivers.TicketMasterBooking.reposirories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public Booking bookTicket(Booking booking){
        Booking retriveBooking = bookingRepository.findByPaymentAndShowSeat(booking.getPayment(), booking.getShowSeat());
        if(retriveBooking == null){
            bookingRepository.save(booking);
            return booking;
        }else {
            throw new RuntimeException("Booking already exists");
        }
    }
}
