package com.kgstrivers.TicketMasterBooking.Controllers;

import com.kgstrivers.TicketMasterBooking.models.Movie;
import com.kgstrivers.TicketMasterBooking.models.Theatre;
import com.kgstrivers.TicketMasterBooking.services.MovieService;
import com.kgstrivers.TicketMasterBooking.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @Autowired
    TheatreService theatreService;

    @PostMapping("/addMovies")
    public ResponseEntity addMovies(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.addMovies(movie));
    }

    @PutMapping("/updateMovies")
    public ResponseEntity putMovies(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.updateTheatreToMovie(movie));
    }

    @GetMapping("/getMoviesWithTheatre/{moviename}")
    public ResponseEntity getMovies(@PathVariable String moviename){
        return ResponseEntity.ok(movieService.getAllTheatre(moviename));
    }

    @GetMapping("/getAllTheatresByPincodeAndMovieName/{moviename}/{pincode}")
    public ResponseEntity getMovies(@PathVariable String moviename, @PathVariable Long pincode){
        return ResponseEntity.ok(movieService.getAllTheatresByPincodeAndMovieName(pincode, moviename));
    }

    @PostMapping("/addTheatre/{moviename}")
    public ResponseEntity getMovies(@PathVariable String moviename, @RequestBody List<Theatre> theatres){
        return ResponseEntity.ok(movieService.getMovieByName(moviename, theatres));
    }

    @GetMapping("/getMoviesForGivenTheatre/{theatreName}")
    public ResponseEntity getMoviesForGivenTheatre(@PathVariable String theatreName){
        return ResponseEntity.ok(theatreService.getMoviesForGivenTheatre(theatreName).getMovies());
    }
}
