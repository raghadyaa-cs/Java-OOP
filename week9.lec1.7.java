
public class Buses extends Vehicle {

    private int seatNumber;

    public Buses() {
    }

    public Buses(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Buses(int seatNumber, String make, int year, int wheelnum, String model) {
        super(make, year, wheelnum, model);
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Buses{" + "seatNumber=" + seatNumber + '}';
    }

}
