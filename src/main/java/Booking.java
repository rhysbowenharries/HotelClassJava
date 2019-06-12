import java.awt.print.Book;

public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;


    public Booking(Bedroom bedroom, int numberOfNights){
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public int getNumberOfNights(){
        return this.numberOfNights;
    }

    public int getBill(){
        return this.numberOfNights * this.bedroom.provideNightlyRate();
    }
}
