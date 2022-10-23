import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada=new Car(1.6,"желтый",2015,"","","528",8,"");
        lada.information();
        Car audi=new Car("Audi","50 L TDL quatro","Германия", 2.4, 2020,"","","м487тт597",5,"");
       audi.information();
        Car bmw=new Car("BMW","Z8","Германия",1.6,2021,"","","и547оо588",6,"");
        bmw.information();
        Car kia=new Car("Kia","Sportage","Южная Корея", 2.4,2018,"","","784",6,"");
        kia.information();
        Car hunday=new Car ("Hunday","Avante","Южная Корея","оранжевый",  1.6,"","","е231ее777",4,"");
        hunday.information();
    }

}