package com.tenxrs.tktbackend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "organizers")
public class Organizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String emailAddress;
    private long cellNumber;
    @OneToOne
    private BankingDetails bankingDetails;

}
