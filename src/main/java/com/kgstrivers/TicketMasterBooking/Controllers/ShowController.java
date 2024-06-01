package com.kgstrivers.TicketMasterBooking.Controllers;

import com.kgstrivers.TicketMasterBooking.models.Show;
import com.kgstrivers.TicketMasterBooking.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShowController {

    @Autowired
    ShowService showService;

    @PostMapping("/addShow")
    public ResponseEntity addShow(@RequestBody Show show) {
        return ResponseEntity.ok(showService.addShow(show));
    }

    @GetMapping("/getShow/{showId}")
    public ResponseEntity getShow(@PathVariable Long showId) {
        return ResponseEntity.ok(showService.getShow(showId));
    }

    @GetMapping("/getShows/")
    public ResponseEntity getShows() {
        return ResponseEntity.ok(showService.getShows());
    }

    @GetMapping("/allSeats/{showId}")
    public ResponseEntity allSeats(@PathVariable Long showId) {
        return ResponseEntity.ok(showService.allSeats(showId));
    }
}
