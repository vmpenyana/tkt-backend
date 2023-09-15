package com.tenxrs.tktbackend.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@Data
@Entity
@Table(name = "organizers")
@EqualsAndHashCode(exclude = {"bankingDetails", "events"})
@ToString(exclude = {"bankingDetails", "events"})
public class Organizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String emailAddress;
    private long cellNumber;
    @OneToOne(cascade = CascadeType.ALL)
    private BankingDetails bankingDetails;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Event> events;
}
