package com.kgstrivers.TicketMasterBooking.Controllers;

import com.kgstrivers.TicketMasterBooking.models.Screen;
import com.kgstrivers.TicketMasterBooking.services.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScreenController {
    @Autowired
    ScreenService screenService;
    @PostMapping("/addScreen")
    public ResponseEntity addScreen(@RequestBody Screen screen) {
        return ResponseEntity.ok(screenService.addScreen(screen));
    }
}
