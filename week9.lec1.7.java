
public class Trucks extends Vehicle {

    private int load;
    private int height;

    public Trucks() {
    }

    public Trucks(int load, int height) {
        this.load = load;
        this.height = height;
    }

    public Trucks(int load, int height, String make, int year, int wheelnum, String model) {
        super(make, year, wheelnum, model);
        this.load = load;
        this.height = height;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Trucks{" + "load=" + load + ", height=" + height + '}';
    }

}
