package com.example.bathadminapp.data;

import com.example.bathadminapp.model.Booking;
import com.example.bathadminapp.model.Room;
import com.example.bathadminapp.model.Service;

import java.util.ArrayList;

public class AppData {
    public static ArrayList<Booking> bookings = new ArrayList<>();
    public static ArrayList<Service> services = new ArrayList<>();
    public static ArrayList<Room> rooms = new ArrayList<>();

    static {
        rooms.add(new Room("Малая баня 1", true));
        rooms.add(new Room("Малая баня 2", true));
        rooms.add(new Room("Малая баня 3", true));
        rooms.add(new Room("Средняя баня 1", true));
        rooms.add(new Room("Средняя баня 2", true));
        rooms.add(new Room("Большая баня 1", true));
        rooms.add(new Room("Большая баня 2", true));
        rooms.add(new Room("VIP 1", true));
        rooms.add(new Room("VIP 2", true));
    }
}

