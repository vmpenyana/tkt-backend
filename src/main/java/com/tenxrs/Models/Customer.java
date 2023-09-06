package com.tenxrs.Models;

import lombok.Data;

import java.util.Set;

@Data
public class Customer {
    private String name;
    private String surname;
    private String emailAddress;
    private long cellNumber;
    public Set<Ticket> tickets;
}
