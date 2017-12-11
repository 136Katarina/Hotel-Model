import Guests.Guest;
import Rooms.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {
    private DiningRoom diningRoom;
    private Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom(10.00, 40);
        guest = new Guest("Andy", "Second", 300.00);

    }
     @Test
       public void hasPrice() {
         assertEquals(10.00, diningRoom.getPrice(),0.02);
        }

        @Test public void hasCapacity(){
         assertEquals(40, diningRoom.getCapacity());
        }
    }
