import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Guest guest;
    private Bedroom bedroom;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private ConferenceRoom conferenceRoom;
    private Hotel hotel;

    @Before
    public void before(){
        guest = new Guest("Rhys");
        bedroom = new Bedroom( 1, 2, "Double", 20);
        bedroom2 = new Bedroom( 2, 3, "Double", 25);
        bedroom3 = new Bedroom( 3, 4, "Double", 29);
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

    @Test
    public void canBookBedroom(){
        Booking testBooking = hotel.createBedRoomBooking(bedroom, 5);
        assertEquals(bedroom, testBooking.getBedroom());
        assertEquals(5, testBooking.getNumberOfNights());
    }

    @Test
    public void canGetBill(){
        Booking testBooking = hotel.createBedRoomBooking(bedroom, 5);
        assertEquals(100, testBooking.getBill());
    }

    @Test
    public void cantCheckInToOccupiedRoom(){
        hotel.checkInGuestToBedroom(bedroom, guest);
        hotel.checkInGuestToBedroom(bedroom, guest);
        assertEquals(1, bedroom.guestsInBedroomCount());
    }

    @Test
    public void canReturnCollectionOfVacantRooms() {
        hotel.checkInGuestToBedroom(bedroom, guest);
        assertEquals(0, hotel.returnCollectionOfVacantRooms());
    }
}
