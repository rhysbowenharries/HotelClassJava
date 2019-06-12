import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String roomType;

    public Bedroom(int roomNumber, int capacity, String roomType){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public void addGuestToRoom(Guest guest){
        this.guests.add(guest);
    }

    public int guestsInBedroomCount() {
        return guests.size();
    }

    public void checkOutGuests() {
        this.guests.clear();
    }
}
