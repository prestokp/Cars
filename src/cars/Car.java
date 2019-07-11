package cars;

import java.time.LocalDate;

public class Car {

    // Car class will have instance data

    private String make;    //Make of the car
    private String model;   //Model of the car
    private int year;       //Year the car was built

    //Constructor object
    public Car(String make, String model, int year){
                           //Our parameter list consistes of the instance variables we
        this.make = make;  //this variable shadows the instance variable make, take parameter make and assign this to instance
                           //variable make
                           // this.make refers to instance variable make
        this.model = model;
        this.year = year;

    }

    //Getters and setters
    //This can be set using the right click, Generator, and then it automatically generates the getter and setter function
    //based off of the instance variables that are defined

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Conditional method that will determine if the car is antique or not
    public boolean isAntique(){
        int currentYear = LocalDate.now().getYear();
        /*
        if (currentYear - year > 45)
            return true;
        else
            return false;
        */
        return currentYear - year > 45; //If it's greater than 45 then it will return true, if not it returns false
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }

}
