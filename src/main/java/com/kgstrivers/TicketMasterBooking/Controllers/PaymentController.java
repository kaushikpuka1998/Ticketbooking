package com.kgstrivers.TicketMasterBooking.Controllers;

import com.kgstrivers.TicketMasterBooking.models.Booking;
import com.kgstrivers.TicketMasterBooking.models.PaymentRequest;
import com.kgstrivers.TicketMasterBooking.models.Show;
import com.kgstrivers.TicketMasterBooking.models.User;
import com.kgstrivers.TicketMasterBooking.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @PostMapping("/pay")
    public ResponseEntity payMethod(@RequestBody PaymentRequest paymentRequest) throws Exception {
        return paymentService.pay(paymentRequest.getBooking(),
                paymentRequest.getShow(),
                paymentRequest.getUser(),
                paymentRequest.getNumberOfTickets(),
                paymentRequest.getPaymentMethod());
    }
}
