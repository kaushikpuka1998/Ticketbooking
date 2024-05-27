package com.kgstrivers.TicketMasterBooking.Controllers;

import com.kgstrivers.TicketMasterBooking.models.City;
import com.kgstrivers.TicketMasterBooking.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    CityService cityService;
    @PostMapping("/addCity")
    public ResponseEntity addCity(@RequestBody City city){
        return ResponseEntity.ok(cityService.addCity(city));
    }
}
