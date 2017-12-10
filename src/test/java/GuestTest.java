import Guests.Guest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GuestTest {

    Guest guest;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;
    ArrayList<Guest>guests;

    @Before
    public void before(){
        guest1 = new Guest("Tom","King", 500.00);
        guest1 = new Guest("Andrea","White", 500.00);
        guests.add(guest);
    }

    @Test
    public void canPay(){

    }
}

