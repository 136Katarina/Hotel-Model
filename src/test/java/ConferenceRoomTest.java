import Guests.Guest;
import Rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest{
    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(200.00, 40);
        guest = new Guest("Andy","Second",300.00);

    }

    @Test
    public void hasPrice(){
        assertEquals(200.00, conferenceRoom.getPrice(), 0.02);
    }

    @Test
    public void isFull(){
        assertEquals(false, conferenceRoom.isFull());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(40, conferenceRoom.getCapacity());
    }

    @Test
    public void canSetCapacity(){
        conferenceRoom.setCapacity(50);
        assertEquals(50, conferenceRoom.getCapacity());
    }
}