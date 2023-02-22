package DzLesson_7;

public class Car {
    public String model;
    public String color;
    public int productinYear;
    public int maxSpeed;

    public Car(String carModel, String carColor, int carProductinYear, int carMaxSpeed)
    {   this.model = carModel;
        this.color = carColor;
        this.productinYear = carProductinYear;
        this.maxSpeed = carMaxSpeed;
    }
    public void getCarDetails ()
    {
        System.out.println("Car model is: " + model);
        System.out.println("Car color is: " + color);
        System.out.println("Car production year is: " + productinYear);
        System.out.println("Car ma[ speed is: " + maxSpeed);
    }
    public static Car getOldestCar(Car[] car1, Car[] car2) {
        Car oldCar = car1[0];
        for (int a = 0; a < car1.length; a++) {
            oldCar = (oldCar.productinYear < car1[a].productinYear) ?
                    ((oldCar.productinYear < car2[a].productinYear) ? oldCar : car2[a]) :
                    ((car1[a].productinYear < car2[a].productinYear) ? car1[a] : car2[a]);
        }
        return oldCar;
    }

    public static Car getFastestCar(Car[] car1, Car[] car2) {
        Car fastCar = car1[0];
        for (int a = 0; a < car1.length; a++) {
            fastCar = (fastCar.maxSpeed > car1[a].maxSpeed) ?
                    ((fastCar.maxSpeed > car2[a].maxSpeed) ? fastCar : car2[a]) :
                    ((car1[a].maxSpeed > car2[a].maxSpeed) ? car1[a] : car2[a]);
        }
        return fastCar;
    }

    @Override
    public String toString() {
        return "Car { "+"model: " + model + '\'' + ", colour: " + color + '\'' + ",yearProduction: "
                + productinYear + ",maxSpeed: " + maxSpeed +'}';
    }
}