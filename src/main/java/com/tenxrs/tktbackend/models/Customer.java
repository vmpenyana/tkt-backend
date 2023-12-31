package com.tenxrs.tktbackend.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Set;

@Data
@Entity
@Table(name = "customers")
@EqualsAndHashCode(exclude = {"tickets"})
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String surname;
    private String emailAddress;
    private long cellNumber;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    public Set<Ticket> tickets;
}
