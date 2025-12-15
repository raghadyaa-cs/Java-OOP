package examsample1;

public class Elevator {

    private char Speed;
    private int Floors;

    public Elevator() {
        this.Speed = 'F';
        this.Floors = 4;
    }

    public Elevator(char Speed, int Floors) {
        this.Speed = Speed;
        this.Floors = Floors;
    }

    public char getSpeed() {
        return Speed;
    }

    public void setSpeed(char Speed) {
        if (Speed == 'F' || Speed == 'S') {
            this.Speed = Speed;
        } else {
            this.Speed = 'F';
        }
    }

    public int getFloors() {
        return Floors;
    }

    public void setFloors(int Floors) {
        if (Floors <= 20 && Floors >= 1) {
            this.Floors = Floors;
        } else {
            System.out.println("invalid number or floors");
        }
    }

    public double getSpeedCost() {
        double SpeedCost = 0;
        switch (Speed) {
            case 'F':
                SpeedCost = 3000;
                break;
            case 'S':
                SpeedCost = 1500;
                break;
        }
        return SpeedCost;
    }

    public double getFloorsCost() {
        double FloorsCost = 0;
        if (Floors >= 1 && Floors <= 5) {
            FloorsCost = Floors * 2000;
        } else if (Floors >= 6 && Floors <= 10) {
            FloorsCost = Floors * 1500;
        } else if (Floors >= 11 && Floors <= 20) {
            FloorsCost = Floors * 1000;
        }
        return FloorsCost;
    }

    public double getTotalCost(int FloorsCost, int SpeedCost) {
        double TotalCost = SpeedCost + FloorsCost + 100;
        return TotalCost;
    }

    @Override
    public String toString() {
        return "Elevator{" + "Speed=" + Speed + ", Floors=" + Floors + '}';
    }

}
