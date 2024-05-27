package com.kgstrivers.TicketMasterBooking.services;

import com.kgstrivers.TicketMasterBooking.models.Movie;
import com.kgstrivers.TicketMasterBooking.models.Theatre;
import com.kgstrivers.TicketMasterBooking.reposirories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public Movie addMovies(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Theatre> getAllTheatre(String MovieName) {
        List<Theatre> theatres = new ArrayList<>();
        try{
            return  theatres = movieRepository.findByMovieName(MovieName).getTheatres();
        }
        catch (Exception e) {
            return theatres;
        }
    }

    public List<Theatre> getAllTheatresByPincodeAndMovieName(Long pincode, String movieName) {
        List<Theatre> theatres = new ArrayList<>();
        List<Movie> movies = movieRepository.findByMovieNameAndCitiesZipcode(movieName, pincode);
        for (Movie movie : movies) {
            theatres.addAll(movie.getTheatres());
        }
        return theatres;
    }

}
