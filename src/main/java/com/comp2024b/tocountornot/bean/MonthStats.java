package com.comp2024b.tocountornot.bean;

import lombok.Data;

import java.util.List;

@Data
public class MonthStats {
    private String income;
    private String expense;
    private List<DayStats> list;
}
