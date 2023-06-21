import java.time.format.DateTimeFormatter; //importing 3 packages
import java.time.LocalDate;
import java.time.LocalTime;

public class Restricted_Spots {
    static DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // The date in the "dd/MM/yyyy" format
    static DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");   // The time in the "HH:mm" format
    static LocalDate localDate = LocalDate.now(); // current date
    static LocalTime localTime = LocalTime.now(); // current time
    public static class Area { // public nested class inside the Restricted_Spots class
        int SpotID; //Instance variable for attribute SpotID
        String SpotName; //Instance variable for attribute SpotName
        int SpotArea; //Instance variable for attribute SpotArea
        int SpotPermittedAverageTime; //Instance variable for attributeSpotPermittedAverageTime
        int SpotMaximumCapacity; //Instance variable for attribute SpotMaximumCapacity
        int NumberOfPeople; //Instance variable for attribute NumberOfPeople

        public Area(int ID, String AreaName, int AreaSpace, int AvgTime, int Space) { //Constructor for the Area Class which takes in 5 arguments
            SpotID = ID; //Initialize instance variables for the Area class
            SpotName = AreaName;
            SpotArea = AreaSpace;
            SpotPermittedAverageTime = AvgTime;
            SpotMaximumCapacity = Space/4; //We enter the same value as AreaSpace and then divide by 4, because of 4 directions assuming that each person has a 1-meter distance
            NumberOfPeople = (int) (Math.random()*(SpotMaximumCapacity+1)+0); //Random number generator that runs from 0 to maximum capacity
        }

        public int permission(int numberofpeople, int SpotMaximumCapacity) { //Method that takes 2 arguments, determines if the user is permitted entrance or not
            if(numberofpeople < SpotMaximumCapacity){
                return 1;
            }
            else{
                return 0;
            }
        }

        public void Display(){ //Method that prints out the information of the SpotArea
            System.out.println("\nStudent ID: 20417309");
            System.out.println("Name: Lua Chong En");
            System.out.println("Spot ID: " + SpotID); //Calling the attribute from Area class
            System.out.println("Spot Name: " + SpotName); //Calling the attribute from Area class
            System.out.println("Spot Area: " + SpotArea); //Calling the attribute from Area class
            System.out.println("Spot Permitted Average Time: " + SpotPermittedAverageTime + " minutes"); //Calling the attribute from Area class
            System.out.println("Spot Maximum Capacity: " + SpotMaximumCapacity); //Calling the attribute from Area class
            System.out.println("Current Capacity: " + NumberOfPeople); //Calling the attribute from Area class
            System.out.println("Date: "+ date.format(localDate)); //Using localDate to display the current date, uses the format
            System.out.println("Time: "+ time.format(localTime)); //Using localDate to display the current time, uses the format
        }
    }

    public static class Area1 extends Area { //Subclass Area1 inherits from the parent class Area and overrides the constructor to set their specified values (this is also a form of polymorphism)
        public Area1() {
            super(1, "Out-Patient Visitors Main Waiting Area", 300, 60, 300); //Using the super keyword to inherit properties and methods from the parent class and also pass the parameters to the constructors
        } //Setting the specified values
    }

    public static class Area2 extends Area { //Subclass Area2 which inherits from the parent class Area and overrides the constructor to set their specified values (this is also a form of polymorphism)
        public Area2() {
            super(2, "Out-Patient Visitors Sub-Waiting Area", 200, 60, 200); //Using the super keyword to inherit properties and methods from the parent class and also pass the parameters to the constructors
        } //Setting the specified values
    }

    public static class Area3 extends Area { //Subclass Area3 which inherits from the parent class Area and overrides the constructor to set their specified values (this is also a form of polymorphism)
        public Area3() {
            super(3, "Intensive Care Unit Visiting Area", 50, 20, 50); //Using the super keyword to inherit properties and methods from the parent class and also pass the parameters to the constructors
        } //Setting the specified values
    }

    public static class Area4 extends Area { //Subclass Area4 which inherits from the parent class Area and overrides the constructor to set their specified values (this is also a form of polymorphism)
        public Area4() {
            super(4, "In-Patient Visitors Waiting Area", 100, 60, 100); //Using the super keyword to inherit properties and methods from the parent class and also pass the parameters to the constructors
        } //Setting the specified values
    }

    public static class Area5 extends Area { //Subclass Area5 which inherits from the parent class Area and overrides the constructor to set their specified values (this is also a form of polymorphism)
        public Area5() {
            super(5, "Medicine Dispensary Unit Waiting Area", 300, 60, 300); //Using the super keyword to inherit properties and methods from the parent class and also pass the parameters to the constructors
        } //Setting the specified values
    }

    public static class Area6 extends Area { //Subclass Area6 which inherits from the parent class Area and overrides the constructor to set their specified values (this is also a form of polymorphism)
        public Area6() {
            super(6, "In-Patient Visitors Sub-Waiting Area", 150, 60, 150); //Using the super keyword to inherit properties and methods from the parent class and also pass the parameters to the constructors
        } //Setting the specified values
    }
}