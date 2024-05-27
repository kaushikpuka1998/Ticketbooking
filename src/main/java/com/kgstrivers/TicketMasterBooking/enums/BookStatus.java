package com.kgstrivers.TicketMasterBooking.enums;

public enum BookStatus {
    BOOKED("Booked"),
    AVAILABLE("Available"),
    PENDING("Pending");

    private String status;

    BookStatus(String status) {
        this.status = status;
    }
}
