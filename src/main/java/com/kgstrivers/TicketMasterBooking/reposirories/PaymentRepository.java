package com.kgstrivers.TicketMasterBooking.reposirories;

import com.kgstrivers.TicketMasterBooking.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
