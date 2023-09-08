package com.tenxrs.tktbackend.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    private Event event;
    @ManyToOne
    private Customer customer;
    private double price;
}
