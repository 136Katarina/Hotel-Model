import Guests.Guest;
import Rooms.Bedroom;
import Rooms.BedroomType;
import Rooms.ConferenceRoom;
import Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;



    @Before
    public void before(){
        guest1 = new Guest("Andrea" "King", 400.00),
        guest2 = new Guest("Tom", "King", 600.00),
        bedroom1 = new Bedroom("A1", BedroomType.DOUBLE);
        bedroom2 = new Bedroom("A2", BedroomType.SINGLE);
        diningRoom = new DiningRoom(10.00,40 );
        conferenceRoom = new ConferenceRoom(50.00, 40);
        hotel.addRoom(bedroom1);
        hotel.addRoom(bedroom2);
        hotel.addRoom(diningRoom);
        hotel.addRoom(conferenceRoom);

    }


    @Test
    public void canAddRoom(){
        assertEquals(4, hotel.getRoomCount());
    }

    @Test
    public void canAddGuest(){
        hotel.checkIn(guest1, bedroom2);
        assertEquals(1, bedroom2.getGuestsCount());
        assertEquals(true,bedroom2.isFull());
    }
}