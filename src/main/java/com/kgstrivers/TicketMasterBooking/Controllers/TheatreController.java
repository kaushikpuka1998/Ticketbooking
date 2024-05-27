package com.kgstrivers.TicketMasterBooking.Controllers;

import com.kgstrivers.TicketMasterBooking.models.Theatre;
import com.kgstrivers.TicketMasterBooking.services.TheatreService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

}
