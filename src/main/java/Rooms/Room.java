package Rooms;

import Guests.Guest;

import java.util.ArrayList;

public class Room {
    protected Integer capacity;
    protected ArrayList<Guest> guests;
    protected double price;


    public Room(double price, int capacity) {
        this.price = price;
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }


    public double getPrice() {
        return price;
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

    public boolean isEmpty(){
        return getGuestsCount() == 0;
    }

    public boolean isFull(){
        return getGuestsCount() >= capacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }
}
