import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;



    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int bedRoomCount() {
        return this.bedrooms.size();
    }

    public void checkInGuestToBedroom(Bedroom bedroom, Guest guest) {
        if (bedroom.guestsInBedroomCount() == 0) {
            bedroom.addGuestToRoom(guest);
        }
    }


    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuestToConferenceRoom(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.addGuestToConferenceRoom(guest);
    }

    public void checkOutGuestBedroom(Bedroom bedroom) {
        bedroom.checkOutGuests();
    }

    public void checkOutGuestConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRoom.checkOutGuests();
    }

    public Booking createBedRoomBooking(Bedroom bedroom, int numberOfNights){
        Booking booking = new Booking(bedroom, numberOfNights);
        return booking;
    }
}
