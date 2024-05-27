package com.kgstrivers.TicketMasterBooking.reposirories;

import com.kgstrivers.TicketMasterBooking.models.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScreenRepository extends JpaRepository<Screen, Long> {
}
