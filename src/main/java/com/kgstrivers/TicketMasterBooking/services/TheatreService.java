package com.kgstrivers.TicketMasterBooking.services;

import com.kgstrivers.TicketMasterBooking.models.Theatre;
import com.kgstrivers.TicketMasterBooking.reposirories.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreService {

    @Autowired
    TheatreRepository theatreRepository;

    public Theatre addTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }

    public List<Theatre> getAllTheatres() {
        return theatreRepository.findAll();
    }

}
