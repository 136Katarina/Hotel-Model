package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class Room {
    private String number;
    private Integer capacity;
    private ArrayList<Guest> guests;


    public Room(String number, int capacity) {
        this.number = number;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public String getRoomNumber() {
        return this.number;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getGuests() {
        return this.guests.size();
    }


    public int getGuestsCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);

    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
