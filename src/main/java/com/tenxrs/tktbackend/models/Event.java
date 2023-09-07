package com.tenxrs.tktbackend.models;


import lombok.Data;

import java.util.Date;
import java.util.Set;
@Data
public class Event {
    private String description;
    private Set<Ticket> tickets;
    private String venue;
    //todo - find suitable type for storing images.
    //private Image  image;
    private Date time;
    private Date date;
    private String province;
    private Organizer organizer;

}