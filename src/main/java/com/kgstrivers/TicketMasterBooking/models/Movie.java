package com.kgstrivers.TicketMasterBooking.models;

import com.kgstrivers.TicketMasterBooking.enums.Genre;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
   @ManyToMany
   @JoinTable(
           name = "movie_theatre",
           joinColumns = { @JoinColumn(name = "movie_id") },
           inverseJoinColumns = { @JoinColumn(name = "theatre_id") }
   )
   Set<Theatre> theatres;
    @ManyToMany
    List<City> cities;
}
