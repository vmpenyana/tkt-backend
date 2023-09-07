package com.tenxrs.tktbackend;

import com.tenxrs.tktbackend.models.BankingDetails;
import com.tenxrs.tktbackend.models.Customer;
import com.tenxrs.tktbackend.models.Organizer;
import com.tenxrs.tktbackend.models.Ticket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TktBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TktBackendApplication.class, args);
	}

}
