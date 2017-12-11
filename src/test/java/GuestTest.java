import Guests.Guest;
import Rooms.Bedroom;
import Rooms.BedroomType;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;
    Guest guest1;
    Room room;
    Bedroom bedroom;
    ArrayList<Guest>guests;

    @Before
    public void before(){
        guest1 = new Guest("Tom","King", 500.00);
        guest1 = new Guest("Andrea","White", 500.00);
        room = new Bedroom("A3", BedroomType.SINGLE);
        guests.add(guest);
    }

    @Test
    public void canAfford(){
        assertEquals(true, guest.hasMoney(bedroom));

    }
}

