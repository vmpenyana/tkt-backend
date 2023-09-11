package com.tenxrs.tktbackend.models;


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
    private Date time;
    private Date date;
    private String province;
    @ManyToOne
    private Organizer organizer;
    @OneToMany(mappedBy = "event")
    private Set<Sale> sales;

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", venue='" + venue + '\'' +
                ", time=" + time +
                ", date=" + date +
                ", province='" + province + '\'' +
                '}';
    }
}
