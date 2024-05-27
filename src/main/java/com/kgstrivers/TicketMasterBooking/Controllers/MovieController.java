package com.kgstrivers.TicketMasterBooking.Controllers;

import com.kgstrivers.TicketMasterBooking.models.Movie;
import com.kgstrivers.TicketMasterBooking.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/addMovies")
    public ResponseEntity addMovies(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.addMovies(movie));
    }

    @GetMapping("/getMoviesWithTheatre/{moviename}")
    public ResponseEntity getMovies(@PathVariable String moviename){
        return ResponseEntity.ok(movieService.getAllTheatre(moviename));
    }

    @GetMapping("/getMoviesWithTheatre/{moviename}/{pincode}")
    public ResponseEntity getMovies(@PathVariable String moviename, @PathVariable Long pincode){
        return ResponseEntity.ok(movieService.getAllTheatresByPincodeAndMovieName(pincode, moviename));
    }
}
