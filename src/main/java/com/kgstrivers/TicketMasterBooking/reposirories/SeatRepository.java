package com.kgstrivers.TicketMasterBooking.reposirories;

import com.kgstrivers.TicketMasterBooking.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {
}
