package Guests;

import Rooms.Room;

import java.util.ArrayList;

public class Guest {
    public String firstName;
    public String lastName;
    public double wallet;
    ArrayList<Guest>guests;


    public Guest(String firstName, String secondName, double walllet){
        this.firstName = firstName;
        this.lastName = lastName;
        this.wallet = wallet;
    }

    public String getFirstName(String firstName) {
        return firstName;
    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public double getWallet(double wallet) {
        return wallet;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public boolean hasMoney(Room room){
        return wallet >= room.getPrice();
    }

    public void add(Guest guest){
        this.guests.add(guest);
    }

}
