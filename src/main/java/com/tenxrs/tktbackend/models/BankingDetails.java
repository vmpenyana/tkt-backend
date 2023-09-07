package com.tenxrs.tktbackend.models;

import lombok.*;

@Data
public class BankingDetails {
    private String bank;
    private long accountNumber;
    private int branchCode;
    private String accountHolder;
    private Organizer organizer;

    public BankingDetails(String bank, long accountNumber, int branchCode, String accountHolder, Organizer organizer) {
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.branchCode = branchCode;
        this.accountHolder = accountHolder;
        this.organizer = organizer;
    }


}
