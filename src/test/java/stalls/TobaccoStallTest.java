package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void visitorNotAllowed(){
        Visitor youngBoy = new Visitor(14, 167.50, 13.50);
        assertEquals(false, tobaccoStall.isAllowedTo(youngBoy));
    }

    @Test
    public void visitorAllowed(){
        Visitor oldBoy = new Visitor(29, 178.30, 19.20);
        assertEquals(true, tobaccoStall.isAllowedTo(oldBoy));
    }


}
