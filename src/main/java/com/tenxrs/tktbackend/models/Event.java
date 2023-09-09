package com.tenxrs.tktbackend.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;
@Data
@Entity
@Table(name = "events")
public class Event {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    @OneToMany
    private Set<Ticket> tickets;
    private String venue;
    //private Image  image;
    private Date time;
    private Date date;
    private String province;
    @ManyToOne
    private Organizer organizer;
    @OneToMany(mappedBy = "event")
    private Set<Sale> sales;

}
