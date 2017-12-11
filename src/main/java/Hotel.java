import Guests.Guest;
import Rooms.Bedroom;
import Rooms.Room;

import java.util.ArrayList;

public class Hotel {


    public String name;
    public double till;
    private ArrayList<Room>rooms;
    private ArrayList<Bedroom>bedrooms;


    public Hotel(String name, double till){
        this.name = name;
        this.till = till;
        this.rooms = new ArrayList<>();
        this.bedrooms = new ArrayList<>();
    }

    public double getTill() {
        return till;
    }

    public String getName() {
        return name;
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public int getRoomCount() {
        return this.rooms.size();
    }

    public void checkIn(Guest guest,Bedroom bedroom) {
        if(!bedroom.isFull())
            bedroom.addGuest(guest);
    }


}
