
public class Cars extends Vehicle {

    private int horsePower;

    public Cars() {
    }

    public Cars(int horsePower) {
        this.horsePower = horsePower;
    }

    public Cars(int horsePower, String make, int year, int wheelnum, String model) {
        super(make, year, wheelnum, model);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Cars{" + "horsePower=" + horsePower + '}';
    }

}
