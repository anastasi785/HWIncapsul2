package Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int manufacturingYear, String manufactureCountry, String color, int maxSpeed) {
        super(brand, model, manufacturingYear, manufactureCountry, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("заправлять бензином или дизелем на заправке.");
    }

}
