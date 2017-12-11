import Guests.Guest;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room;
    ArrayList<Guest>guests;
    Guest guest;
    Guest guest2;


    @Before
    public void before(){
        room = new Room(100.00, 3);
        guests = new ArrayList<Guest>();
        guest = new Guest("Tom", "King",500.00);
        guest2 = new Guest("Andrea", "White", 400.00);

    }

   @Test
   public void canGetPrice(){
        assertEquals(100.00, room.getPrice(), 0.02);
   }

    @Test
    public void canGetCapacity(){
        assertEquals(3, room.getCapacity());
    }

    @Test
    public void canGetGuests(){
        room.addGuest(guest);
        room.addGuest(guest2);
        assertEquals(2, room.getGuests());;
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, room.getGuestsCount());
    }

    @Test
    public void canAddGuest(){
        room.addGuest(guest);
        {assertEquals(1,room.getGuestsCount());
        }
    }

    @Test
    public void canRemoveGuest(){
        room.addGuest(guest);
        assertEquals(1,room.getGuestsCount());
        room.removeGuest(guest);
        assertEquals(0, room.getGuestsCount());
    }
    @Test
    public void canChangeCapacity(){
        room.setCapacity(5);
        assertEquals(5, room.getCapacity());
    }

}
