package Transport;

public class Driver  {
    String name;
    String driverLisense;
    double experience;



    public Driver(String name, String driverLisense, double experience) {
        this.name = name;
        this.driverLisense = driverLisense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverLisense() {
        return driverLisense;
    }

    public void setDriverLisense(String driverLisense) {
        this.driverLisense = driverLisense;
    }

    public double isExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }


    void startToMove(){};

    void stopToMove(){};

    void refillCar(){};


    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverLisense='" + driverLisense + '\'' +
                ", experience=" + experience +
                '}';
    }
}
