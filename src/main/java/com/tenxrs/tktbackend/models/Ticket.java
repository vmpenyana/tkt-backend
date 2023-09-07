package com.tenxrs.tktbackend.models;

import lombok.Data;

@Data
public class Ticket {
    private Event event;
    private Customer customer;
    private double price;
}
