package com.kgstrivers.TicketMasterBooking.enums;

public enum Genre {
    ACTION("Action"),
    ADVENTURE("Adventure"),
    COMEDY("Comedy"),
    CRIME("Crime"),
    DRAMA("Drama"),
    FANTASY("Fantasy"),
    HISTORICAL("Historical"),
    HORROR("Horror");

    private String genre;

    Genre(String genre) {
        this.genre = genre;
    }

}
