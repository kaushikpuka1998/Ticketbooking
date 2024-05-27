package com.kgstrivers.TicketMasterBooking.enums;

public enum PaymentType {
    UPI("UPI"),
    CARD("CARD"),
    NETBANKING("NETBANKING");

    private String paymentType;

    PaymentType(String paymentType){
        this.paymentType = paymentType;
    }
}
