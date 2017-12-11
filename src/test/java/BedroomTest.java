import Guests.Guest;
import Rooms.Bedroom;
import Rooms.BedroomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest{
    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom("A1", BedroomType.SINGLE);
        guest = new Guest("Andrea", "King", 500.00);
    }

    @Test
    public void canGetRoomName(){
        assertEquals("A1",bedroom.getRoomName());
    }

    @Test
    public void canGetRoomType(){
        assertEquals("Single", bedroom.getBedroomType());
    }

    @Test
    public void canGetRoomCapity(){
        assertEquals(1,bedroom.getCapacity());
    }

    @Test
    public void canGetRoomPrice(){
        assertEquals(180.00,bedroom.getPrice(), 0.02);
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestsCount());
    }

    @Test
    public void canRemoveGues(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuestsCount());
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getGuestsCount());
    }



}