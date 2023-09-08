package com.tenxrs.tktbackend.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String surname;
    private String emailAddress;
    private long cellNumber;
    @OneToMany(mappedBy = "customer")
    public Set<Ticket> tickets;
}
