import Transport.Bus1;
import Transport.Driving;


public class DriverD<J extends Bus1 & Driving> {
    String name;
    String licence;
    String experience;

    public DriverD(String name, String licence, String experience) {
        this.name = name;
        this.licence = licence;
        this.experience = experience;
    }


    public void drive(J bus1) {
        bus1.startToDrive();

        bus1.refillCar();
        bus1.stopToDrive();
        System.out.println("водитель с категорией прав " + getLicence() + " управляет автобусом " + bus1.getBrand() +
                " и будет участвовать в заезде");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}