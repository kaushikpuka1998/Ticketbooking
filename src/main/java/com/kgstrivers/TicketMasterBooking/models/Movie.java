package com.kgstrivers.TicketMasterBooking.models;

import com.kgstrivers.TicketMasterBooking.enums.Genre;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Movie {
 @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    Long id;
    String movieName;
    Date releaseDate;
    String summary;
    @Enumerated(EnumType.STRING)
    Genre genre;
    @OneToMany
    List<Theatre> theatres;
    @ManyToMany
    List<City> cities;
}
