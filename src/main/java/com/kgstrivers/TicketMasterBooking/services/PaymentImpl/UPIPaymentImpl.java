package com.kgstrivers.TicketMasterBooking.services.PaymentImpl;

import com.kgstrivers.TicketMasterBooking.enums.PaymentType;
import com.kgstrivers.TicketMasterBooking.models.Booking;
import com.kgstrivers.TicketMasterBooking.models.Payment;
import com.kgstrivers.TicketMasterBooking.models.Show;
import com.kgstrivers.TicketMasterBooking.models.User;
import com.kgstrivers.TicketMasterBooking.reposirories.PaymentRepository;
import com.kgstrivers.TicketMasterBooking.services.PaymentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UPIPaymentImpl implements PaymentInterface {

    @Autowired
    PaymentRepository paymentRepository;
    @Override
    public Payment pay(Booking booking, Show show, User user, int numberOfTickets, String paymentMethod) {
        System.out.println("Payment done through UPI");
        Payment payment = new Payment();
        payment.setAmount(booking.getShowSeat().getPrice()*numberOfTickets);
        payment.setPaymentMode(PaymentType.UPI);
        paymentRepository.save(payment);
        return payment;

    }
}
