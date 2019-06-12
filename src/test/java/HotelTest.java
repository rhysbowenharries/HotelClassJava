import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Guest guest;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Hotel hotel;

    @Before
    public void before(){
        guest = new Guest("Rhys");
        bedroom = new Bedroom( 1, 2, "Double");
        conferenceRoom = new ConferenceRoom( "Excelsior", 20);
        hotel = new Hotel();
    }

    @Test
    public void canAddBedroomToHotel(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.bedRoomCount());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.checkInGuestToBedroom(bedroom, guest);
        assertEquals(1, bedroom.guestsInBedroomCount());
    }

    @Test
    public void canAddConferenceRoomToHotel(){
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckinGuestToConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.guestsInConferenceRoomCount());

    }

    @Test
    public void canCheckOutGuestBedroom(){
        hotel.checkOutGuestBedroom(bedroom);
        assertEquals(0, bedroom.guestsInBedroomCount());
    }

    @Test
    public void canCheckOutGuestConferenceRoom(){
        hotel.checkOutGuestConferenceRoom(conferenceRoom);
        assertEquals(0, conferenceRoom.guestsInConferenceRoomCount());
    }

}
