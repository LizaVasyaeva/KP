package com.example.bathadminapp.model;

import java.util.ArrayList;

public class Booking {

    public String clientName;
    public String room;
    public String date;
    public String time;

    public int hourPrice;        // цена за час
    public int durationHours;    // длительность в часах

    public ArrayList<Service> services;

    public Booking(String clientName, String room, String date, String time) {
        this.clientName = clientName;
        this.room = room;
        this.date = date;
        this.time = time;
        this.services = new ArrayList<>();
        this.hourPrice = 0;
        this.durationHours = 1;
    }

    // 🔥 стоимость услуг
    public int getServicesPrice() {
        int sum = 0;
        for (Service s : services) {
            sum += s.price;
        }
        return sum;
    }

    // 🔥 стоимость аренды
    public int getRoomPrice() {
        return hourPrice * durationHours;
    }

    // 🔥 итоговая стоимость
    public int getTotalPrice() {
        return getRoomPrice() + getServicesPrice();
    }
}



