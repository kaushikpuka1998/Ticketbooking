package com.kgstrivers.TicketMasterBooking.services;

import com.kgstrivers.TicketMasterBooking.models.Movie;
import com.kgstrivers.TicketMasterBooking.models.Screen;
import com.kgstrivers.TicketMasterBooking.models.Theatre;
import com.kgstrivers.TicketMasterBooking.reposirories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public Movie addMovies(Movie movie) {
        Movie retrievedMovie = movieRepository.findByMovieName(movie.getMovieName());
        if(retrievedMovie!=null){
            throw new RuntimeException("Movie already exists");
        }
        return movieRepository.save(movie);
    }

    public Movie updateTheatreToMovie(Movie movie) {
        Movie retrievedMovie = movieRepository.findByMovieName(movie.getMovieName());
        if(retrievedMovie!=null){
            retrievedMovie.setMovieName(movie.getMovieName());
            retrievedMovie.setReleaseDate(movie.getReleaseDate());
            retrievedMovie.setSummary(movie.getSummary());
            retrievedMovie.setGenre(movie.getGenre());
            retrievedMovie.setTheatres(movie.getTheatres());
            retrievedMovie.setCities(movie.getCities());
            return movieRepository.save(retrievedMovie);

        }
        else{
            throw new RuntimeException("Movie not found");
        }
    }

    public Set<Theatre> getAllTheatre(String MovieName) {
        Set<Theatre> theatres = new HashSet<>();
        try {
            return theatres = movieRepository.findByMovieName(MovieName).getTheatres();
        } catch (Exception e) {
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

    public Movie getMovieByName(String movieName, List<Theatre> theatres) {
        Movie movie = movieRepository.findByMovieName(movieName);
        if (movie != null) {
            Set<Theatre> theatresList = movie.getTheatres();
            theatresList.addAll(theatres);
            movieRepository.save(movie);
            return movie;
        }else{
            throw new RuntimeException("Movie not found");
        }
    }

}
