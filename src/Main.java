import Transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada=new Car("Lada","Granta",1.6f,"желтый",2015,
                "russia","mechanic","Sedan","A001MH177",8,
                new Car.Key(true,true),
                new Car.Insurance(
                        LocalDate.now().plusMonths(3),
                        1000.0f,"123456789"));
        System.out.println(lada.toString());


    }

}