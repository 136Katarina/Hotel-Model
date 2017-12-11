package Rooms;



public class DiningRoom extends Room {


    public DiningRoom(double price, int capacity) {
        super(price, capacity);
        this.price = price;
        this.capacity = capacity;
    }

    public double getPrice() {
        return this.price;
    }


    public int getCapacity() {
        return this.capacity;
    }
}
