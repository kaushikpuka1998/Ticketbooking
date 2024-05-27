package com.kgstrivers.TicketMasterBooking.services;

import com.kgstrivers.TicketMasterBooking.models.Screen;
import com.kgstrivers.TicketMasterBooking.reposirories.ScreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScreenService {
    @Autowired
    ScreenRepository screenRepository;
    public Screen addScreen(Screen screen) {
        return screenRepository.save(screen);
    }
}
