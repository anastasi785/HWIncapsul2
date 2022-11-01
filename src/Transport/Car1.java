package Transport;

public abstract class Car1 {
    private final String brand;
    private final String model;
    private final double engineVolume;

    public Car1(String brand, String model, double engineVolume) {
        this.brand = validofDefault(brand,"no");
        this.model = validofDefault(brand,"no");
        this.engineVolume = engineVolume;
    }
    protected String validofDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }
    public abstract void startOfMoving();{
        System.out.println("нажать на педаль");
    }
    public abstract void stopMoving();{
        System.out.println("нажать на тормоз");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
