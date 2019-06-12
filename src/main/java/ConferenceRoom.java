import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;
    private String roomName;

    public ConferenceRoom(String roomName, int capacity){
        this.roomName = roomName;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int guestsInConferenceRoomCount() {
        return this.guests.size();
    }

    public void addGuestToConferenceRoom(Guest guest) {
        this.guests.add(guest);
    }

    public void checkOutGuests() {
        this.guests.clear();
    }
}
