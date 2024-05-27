package com.kgstrivers.TicketMasterBooking.reposirories;

import com.kgstrivers.TicketMasterBooking.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Show, Long> {
}
