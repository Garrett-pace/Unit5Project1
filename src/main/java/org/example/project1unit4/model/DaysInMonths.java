package org.example.project1unit4.model;

public enum DaysInMonths {
    January(31),
    February(28),
    March(31),
    April(30),
    May(31),
    June(30),
    July(31),
    August(31),
    September(30),
    October(31),
    November(30),
    December(31)
    ;

    private int DaysofTheMonth;
    DaysInMonths(int i) {
        this.DaysofTheMonth = i;
    }
}
