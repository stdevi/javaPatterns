package CreationalPatterns.SimpleBuilder;

/**
 * Created by dvsta on 23.11.2017.
 */
public class Car {
    String maker;
    Transmission transmission;
    int maxSpeed;

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public enum Transmission {MANUAL, AUTO}

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + maker + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
