package com.kgstrivers.TicketMasterBooking.services;

import com.kgstrivers.TicketMasterBooking.models.Movie;
import com.kgstrivers.TicketMasterBooking.models.Theatre;
import com.kgstrivers.TicketMasterBooking.reposirories.MovieRepository;
import com.kgstrivers.TicketMasterBooking.reposirories.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    @Autowired
    TheatreRepository theatreRepository;

    @Autowired
    MovieRepository movieRepository;

    public Theatre addTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }

    public List<Theatre> getAllTheatres() {
        return theatreRepository.findAll();
    }

    public Theatre updateTheatreName(String theatre, String newTheatreName) {
        Theatre retrivedTheatre = theatreRepository.findByName(theatre);
        if (retrivedTheatre == null) {
            return null;
        }
        else{
            retrivedTheatre.setName(newTheatreName);
            return theatreRepository.save(retrivedTheatre);
        }
    }

    public Theatre getMoviesForGivenTheatre(String theatreName) {
        return theatreRepository.findByName(theatreName);
    }

    public Theatre addMoviesInTheatre(String theatre, String movie) {
        try {
            Theatre retrivedTheatre = theatreRepository.findByName(theatre);
            Movie retrivedMovie = movieRepository.findByMovieName(movie);
            if (retrivedTheatre == null || retrivedMovie == null) {
                return null;
            }
            else{
                retrivedTheatre.getMovies().add(retrivedMovie);
                return theatreRepository.save(retrivedTheatre);
            }
        }
        catch (Exception e) {
            return null;
        }
    }
}
