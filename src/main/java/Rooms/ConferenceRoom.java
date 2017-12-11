package Rooms;

import Rooms.Room;

public class ConferenceRoom extends Room {

    public ConferenceRoom(double price, int capacity) {
        super(price, capacity);
        this.price = price;
        this.capacity = capacity;
    }


    public double getPrice(){
        return price;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
