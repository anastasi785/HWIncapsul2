import Transport.Car;

import java.time.LocalDate;
import Transport.Train;
import Transport.Bus;
public class Main {
    public static void main(String[] args) {
        Car lada=new Car("Lada","Granta",1.6f,"желтый",2015,
                "russia","mechanic","Sedan","A001MH177",8,
                new Car.Key(true,true),
                new Car.Insurance(
                        LocalDate.now().plusMonths(3),
                        1000.0f,"123456789"));
        System.out.println(lada.toString());

        Train lastochka=new Train("Lastochka","b-901",2001,"Russia","",
                301,3500,0,"Beloruski railway",
                "Minsk passengers",11);
        System.out.println(lastochka.toString());

        Bus ikarus=new Bus("Ikarus","f-150",1987,"Russia","Orange",300);
        System.out.println(ikarus.toString());

        lada.refill();
        lastochka.refill();
        ikarus.refill();



    }


}