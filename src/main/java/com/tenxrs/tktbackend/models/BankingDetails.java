package com.tenxrs.tktbackend.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "banking_details")
public class BankingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String bank;
    private long accountNumber;
    private int branchCode;
    private String accountHolder;
    @OneToOne
    private Organizer organizer;
}
