package com.kgstrivers.TicketMasterBooking.reposirories;

import com.kgstrivers.TicketMasterBooking.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findByMovieName(String movieName);
    List<Movie> findByCitiesZipcode(Long zipcode);
    List<Movie> findByMovieNameAndCitiesZipcode(String movieName, Long pincode);
}
