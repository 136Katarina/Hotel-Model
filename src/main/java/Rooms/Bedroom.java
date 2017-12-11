package Rooms;



public class Bedroom extends Room {

    private String roomName;
    private BedroomType bedroomType;


    public Bedroom( String roomName, BedroomType bedroomType) {
        super(double price, int capacity);

        this.roomName = roomName;
        this.bedroomType = bedroomType;
        this.capacity = bedroomType.getCapacity();
        this.price = bedroomType.getPrice();
    }


    public String getRoomName(){
        return  this.roomName;
    }

    public String getBedroomType(){
        return  this.bedroomType.getRoomType();
    }


}




