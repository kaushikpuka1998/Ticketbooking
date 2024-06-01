package com.kgstrivers.TicketMasterBooking.services;

import com.kgstrivers.TicketMasterBooking.models.Seat;
import com.kgstrivers.TicketMasterBooking.models.Show;
import com.kgstrivers.TicketMasterBooking.reposirories.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowService {

    @Autowired
    ShowRepository showRepository;

    public Show addShow(Show show) {
        return showRepository.save(show);
    }

    public Show getShow(Long showId) {
        return showRepository.findById(showId).orElse(null);
    }

    public Iterable<Show> getShows() {
        return showRepository.findAll();
    }

    public Iterable<Seat> allSeats(Long showId) {
        return showRepository.findById(showId).orElse(null).getSeats();
    }

}
