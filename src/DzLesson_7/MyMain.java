package DzLesson_7;

import static DzLesson_7.Car.getFastestCar;
import static DzLesson_7.Car.getOldestCar;

public class MyMain {
    public static void main (String [] args){

        Car [] car1 = {new Car("Lexus", "Red", 2022,250),
                     new Car( "Mazda ","Blue" , 1999, 200),
                     new Car("Zhiguli", "Red", 2023, 300),
                     new Car("Opel","Blue", 2005,150)};
        Car [] car2 = { new Car("BMW", "Yellow",2006,220),
                        new Car("Audi", "black",2008,199),
                        new Car("Ford","White",1995,160 ),
                        new Car("Suzuki", "Grenn",1990,120)};

        System.out.println("The oldest car is: " + getOldestCar(car1, car2));
        System.out.println("The fastest car is: " + getFastestCar(car1, car2));
        System.out.println();

    }
}
