package com.tenxrs.tktbackend.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.Set;
@Data
@Entity
@Table(name = "events")
@EqualsAndHashCode(exclude = {"tickets", "organizer"})
public class Event {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    @OneToMany
    private Set<Ticket> tickets;
    private String venue;
    //private Image  image;
    @Temporal(TemporalType.TIME)
    private Date time;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String province;
    @ManyToOne
    @JsonIgnore
    private Organizer organizer;
    @OneToMany(mappedBy = "event")
    private Set<Sale> sales;

}
