package com.comp2024b.tocountornot.bean;

import lombok.Data;

@Data
public class Card {
    private int id;
    private String name;
    private String note;
    private int image;
    private double income;
    private double expense;
    private double balance;
    private int uid;
}
