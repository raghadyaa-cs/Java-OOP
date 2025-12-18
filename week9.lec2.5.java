package raghadyaaoop;
public class EvCar extends Car {

    @Override
    public void turnOff() {
        System.out.println("start battery");
    }

    @Override
    public void turnOn() {
        System.out.println("stop battery");
    }
    
}
