package com.kgstrivers.TicketMasterBooking;

import org.hibernate.annotations.Comment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication
public class TicketMasterBookingApplication extends WebMvcAutoConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(TicketMasterBookingApplication.class, args);
	}

}
