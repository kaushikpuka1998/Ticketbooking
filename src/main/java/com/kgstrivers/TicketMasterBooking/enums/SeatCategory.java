package com.kgstrivers.TicketMasterBooking.enums;

public enum SeatCategory {
    PLATINUM("Platinum", 100),
    GOLD("Gold", 80),
    SILVER("Silver", 60),
    BRONZE("Bronze", 40);

    private String name;
    private int price;

    SeatCategory(String type, int price) {
        this.name = type;
        this.price = price;
    }
}
