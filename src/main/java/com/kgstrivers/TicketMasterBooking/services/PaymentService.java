package com.kgstrivers.TicketMasterBooking.services;

import com.kgstrivers.TicketMasterBooking.models.Booking;
import com.kgstrivers.TicketMasterBooking.models.Payment;
import com.kgstrivers.TicketMasterBooking.models.Show;
import com.kgstrivers.TicketMasterBooking.models.User;
import com.kgstrivers.TicketMasterBooking.services.PaymentImpl.PaymentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    PaymentFactory paymentFactory;

    public ResponseEntity pay(Booking booking, Show show, User user, int numberOfTickets, String paymentMethod) throws Exception {
        PaymentInterface paymentInterface = paymentFactory.getPaymentMethod(paymentMethod);
        try {
            if (paymentInterface == null) {
                throw new Exception("Invalid payment method");
            }
            Payment payment = paymentInterface.pay(booking, show, user, numberOfTickets, paymentMethod);
            booking.setPayment(payment);
            return ResponseEntity.ok(payment);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(e.getMessage());
        }
    }
}
