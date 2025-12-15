
public class Vehicle {

    private String make;
    private int year;
    private int wheelnum;
    private String model;

    public Vehicle() {
    }

    public Vehicle(String make, int year, int wheelnum, String model) {
        this.make = make;
        this.year = year;
        this.wheelnum = wheelnum;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWheelnum() {
        return wheelnum;
    }

    public void setWheelnum(int wheelnum) {
        this.wheelnum = wheelnum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "make=" + make + ", year=" + year + ", wheelnum=" + wheelnum + ", model=" + model + '}';
    }

}
