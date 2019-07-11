package cars;

import java.util.Scanner;

public class CarLot {

    public static void main(String[] args) {

        Car car1 = new Car("Nissan", "Altima", 2015);
        Car car2 = new Car("Tesla", "Model S", 2019);
        Car car3 = new Car("Ford", "Model T", 1908);
        Car car4 = new Car("BMW", "X5", 2016);

        System.out.println(car1 + ", Antique: " + car1.isAntique());
        System.out.println(car2 + ", Antique: " + car2.isAntique());
        System.out.println(car3 + ", Antique: " + car3.isAntique());
        System.out.println(car4 + ", Antique: " + car4.isAntique());

        //The code below demonstrates the purposes of using getter and setter functions within a driver class & program
        //System.out.println("The make of Car 1 is " + car1.getMake());
        //System.out.println("The model of Car 1 is " + car1.getModel());
        //car1.setMake("Tesla");
        //car1.setModel("Model 3");
        //car1.setYear(2019);

        //Different variations of the purposes and uses of the getter & setter functions
        /*
        String make, model;
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the make? ");
        make = sc.nextLine();

        System.out.print("What is the model? ");
        model = sc.nextLine();

        System.out.println("What is the year? ");
        year = sc.nextInt();

        Car car5 = new Car(make, model, year);
        car5.setMake(make);
        car5.setModel(model);
        car5.setYear(year);
        System.out.println(car5);
        */
    }
}

//Github Push Test