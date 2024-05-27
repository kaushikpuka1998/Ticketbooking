package com.kgstrivers.TicketMasterBooking.Controllers;

import com.kgstrivers.TicketMasterBooking.models.Movie;
import com.kgstrivers.TicketMasterBooking.models.Theatre;
import com.kgstrivers.TicketMasterBooking.services.TheatreService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheatreController {

    @Autowired
    TheatreService theatreService;

    @PostMapping("/addTheatre")
    public ResponseEntity addTheatre(@RequestBody  Theatre theatre) {
        return ResponseEntity.ok(theatreService.addTheatre(theatre));
    }

    @GetMapping("/getAllTheatres")
    public ResponseEntity getAllTheatres() {
        return ResponseEntity.ok(theatreService.getAllTheatres());
    }

    @PutMapping("/updateTheatreName/{theatre}")
    public ResponseEntity updateTheatreName(@PathVariable String theatre, @RequestBody String newTheatreName) {
        return ResponseEntity.ok(theatreService.updateTheatreName(theatre, newTheatreName));
    }

    @PutMapping("/addMoviesInTheatre/{theatre}")
    public ResponseEntity addMoviesInTheatre(@RequestBody String movie, @PathVariable String theatre) {
        return ResponseEntity.ok(theatreService.addMoviesInTheatre(theatre, movie));
    }



}
