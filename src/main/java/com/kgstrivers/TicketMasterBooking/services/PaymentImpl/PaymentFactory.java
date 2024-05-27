package com.kgstrivers.TicketMasterBooking.services.PaymentImpl;

import com.kgstrivers.TicketMasterBooking.enums.PaymentType;
import com.kgstrivers.TicketMasterBooking.services.PaymentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentFactory {
    @Autowired
    CardImpl cardImpl;

    @Autowired
    NetBankingImpl netBankingImpl;

    @Autowired
    UPIPaymentImpl upiPaymentImpl;

    public PaymentInterface getPaymentMethod(String paymentMethod) {
        if(paymentMethod.equals(PaymentType.CARD.name())) {
            return cardImpl;
        }
        if(paymentMethod.equals(PaymentType.UPI.name())) {
            return upiPaymentImpl;
        }
        else if(paymentMethod.equals(PaymentType.NETBANKING.name())) {
            return netBankingImpl;
        }
        return null;
    }
}
