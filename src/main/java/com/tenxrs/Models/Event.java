package com.tenxrs.Models;

import java.awt.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Event {
    private String description;
    private double price;
    private String venue;
    private Image  image;
    private Date time;
    private Date date;
    private String province;
    Organizer organizer = new Organizer();

}
