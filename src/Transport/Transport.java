package Transport;

public abstract class Transport {
    private String brand;
    private String model;
    private final int manufacturingYear;
    private final String manufactureCountry;
    private String color;
    private int maxSpeed;





    protected String validofDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public Transport(String brand, String model, int manufacturingYear, String manufactureCountry, String color, int maxSpeed) {
        this.brand = validofDefault(brand, "defalt");
        this.model = validofDefault(model, "default");
        this.manufacturingYear = manufacturingYear;
        this.manufactureCountry = manufactureCountry;
        this.color = validofDefault(color, "default");
        this.maxSpeed = maxSpeed;
    }
    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public String getManufactureCountry() {
        return manufactureCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                ", manufactureCountry='" + manufactureCountry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}