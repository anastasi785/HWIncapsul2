import Transport.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
 //       Car lada= new Car("Lada", "Granta", 1.6f, "желтый", 2015,
 //               "russia", "mechanic", "Sedan", "A001MH177", 8,
 //               new Car.Key(true, true),
 //              new Car.Insurance(
 //                       LocalDate.now().plusMonths(3),
 //                       1000.0f, "123456789")) ;
 //
//
//        System.out.println(lada.toString());

//        Train lastochka=new Train("Lastochka","b-901",2001,"Russia","",
//                301,3500,0,"Beloruski railway",
//                "Minsk passengers",11);
//             System.out.println(lastochka);

//        Bus ikarus=new Bus("Ikarus","f-150",1987,"Russia","Orange",300);
//        System.out.println(ikarus.toString());

 //       lada.refill();
  //      lastochka.refill();
  //      ikarus.refill();



        Bus1 liaz=new Bus1("Liaz","f-150", 1.6f);
//        System.out.println(liaz);
 //       liaz.stopMoving();


        PassengerCar kia=new PassengerCar("Kia","Sefia",1.8f);
//        System.out.println(kia);

       Trucks bmw=new Trucks("Bmw","547-t",2.0f);
//        System.out.println(bmw);

  //      bmw.bestLapTime();

//        kia.maxSpeed();

//        System.out.println(liaz.pitStop());

//        kia.pitStop();



        DriverB<PassengerCar>nick=new DriverB<>("Nick","B","4");
        nick.drive(kia);

        DriverC<Trucks>ed=new DriverC<>("Ed","C","5");
        ed.drive(bmw);

        DriverD<Bus1>fil=new DriverD<>("Fil","D","7.4");
        fil.drive(liaz);





        kia.chooseBodyType(PassengerCar.BodyType.SEDAN.name());

        bmw.chooseLoadCapacity(Trucks.LoadCapacity.NUM_1.name());

        liaz.chooseCapacity(Bus1.Capacity.AVERAGE.name());

        liaz.chooseCapacity("100-120 мест");

        kia.chooseBodyType("Выбран Кроссовер");

    }


}