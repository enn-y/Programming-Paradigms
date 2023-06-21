import java.util.Objects; //importing 2 packages
import java.util.Scanner;

public class Static_Distancing {
    public static class SD extends Dynamic_Distancing{} //SD subclass inheriting Dynamic Distancing Class
    
    public static void main(String[] args) {
        String choice; //Choice variable is declared here, this is user input
        do { //do while loop starts here
            System.out.print("\n");
            Scanner sc = new Scanner(System.in);  //Creating a new instance of the Scanner class
            System.out.print(""" 
                    Choose the area of the hospital you want to enter:
                                        
                    1. Out-Patient Visitors Main Waiting Area
                    2. Out-Patient Visitors Sub-Waiting Area
                    3. Intensive Care Unit Visiting Area
                    4. In-Patient Visitors Waiting Area
                    5. Medicine Dispensary Unit Waiting Area
                    6. In-Patient Visitors Sub-Waiting Area
                    7. Exit
                                        
                    Choice:\s"""); // """ syntax is used to create multi-line string for easier reading
            int a = sc.nextInt(); // input is taken in here and assigned to variable integer a
            switch (a) { // start of the switch statement where it checks user input in variable a
                case 1 -> {
                    Restricted_Spots.Area1 Choice1 = new Restricted_Spots.Area1(); //Object of class Area1 is created and assigned to Choice1
                    Choice1.Display(); //Method display is called on Choice1 Object

                    if ((Choice1.permission(Choice1.NumberOfPeople, Choice1.SpotMaximumCapacity)) == 1) { //Permission is called on Choice1 object to check if maximum capacity of area has been reached or not
                        System.out.println("""
                                                                
                                You are allowed to enter the area.
                                Please enter the distance you are keeping from people around you from all 4 directions."""); // """ syntax is used to create multi-line string for easier reading
                        System.out.print("\nFront: ");
                        float Front = sc.nextFloat(); // User input where distance is entered from Front
                        System.out.print("\nBack: ");
                        float Back = sc.nextFloat(); // User input where distance is entered from Back
                        System.out.print("\nLeft: ");
                        float Left = sc.nextFloat(); // User input where distance is entered from Left
                        System.out.print("\nRight: ");
                        float Right = sc.nextFloat(); // User input where distance is entered from Right

                        SD.Direction(Front, Back, Left, Right); //Direction method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                        SD.Contact_Status(Front, Back, Left, Right); //Contact_Status method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                        SD.Contact_Status(SD.FindShortestDistance(Front, Back, Left, Right)); //Contact Status method called on the SD subclass, this is method overriding
                        SD.ClinicAppointment(SD.FindShortestDistance(Front, Back, Left, Right)); //Clinic Appointment method called on SD subclass
                    } else { //If the area is full, it will fall into this else block
                        System.out.println("\nThe capacity of the area is full. You are not allowed to enter the area. You need to wait " + Choice1.SpotPermittedAverageTime + " minutes."); //User is asked to wait SpotPermittedAverageTime
                        System.out.print("\nDo you want to wait? (y/n): "); //Assume that the user can enter nevertheless
                        String waitchoice = sc.next(); //User input taken here
                        if (waitchoice.equals("y") || waitchoice.equals("Y")) { //If the user input is equals to 'y'
                            System.out.println("\n" + Choice1.SpotPermittedAverageTime + " minutes has passed, you are now permitted to enter."); //Assume that the SpotPermittedAverageTime has passed
                            System.out.println("Please enter the distance you are keeping from people around you from all 4 directions.");

                            System.out.print("\nFront: ");
                            float Front = sc.nextFloat(); // User input where distance is entered from Front
                            System.out.print("\nBack: ");
                            float Back = sc.nextFloat(); // User input where distance is entered from Back
                            System.out.print("\nLeft: ");
                            float Left = sc.nextFloat(); // User input where distance is entered from Left
                            System.out.print("\nRight: ");
                            float Right = sc.nextFloat(); // User input where distance is entered from Right

                            SD.Direction(Front, Back, Left, Right); //Direction method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                            SD.Contact_Status(Front, Back, Left, Right); //Contact_Status method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                            SD.Contact_Status(SD.FindShortestDistance(Front, Back, Left, Right)); //Contact Status method called on the SD subclass, this is method overriding
                            SD.ClinicAppointment(SD.FindShortestDistance(Front, Back, Left, Right)); //Clinic Appointment method called on SD subclass
                        }
                    }
                }
                case 2 -> {
                    Restricted_Spots.Area2 Choice2 = new Restricted_Spots.Area2(); //Object of class Area2 is created and assigned to Choice2
                    Choice2.Display(); //Method display is called on Choice1 Object

                    if ((Choice2.permission(Choice2.NumberOfPeople, Choice2.SpotMaximumCapacity)) == 1) { //Permission is called on Choice1 object to check if maximum capacity of area has been reached or not
                        System.out.println("""
                                                                
                                You are allowed to enter the area.
                                Please enter the distance you are keeping from people around you from all 4 directions.""");
                        System.out.print("\nFront: ");
                        float Front = sc.nextFloat(); // User input where distance is entered from Front
                        System.out.print("\nBack: ");
                        float Back = sc.nextFloat(); // User input where distance is entered from Back
                        System.out.print("\nLeft: ");
                        float Left = sc.nextFloat(); // User input where distance is entered from Left
                        System.out.print("\nRight: ");
                        float Right = sc.nextFloat(); // User input where distance is entered from Right

                        SD.Direction(Front, Back, Left, Right); //Direction method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                        SD.Contact_Status(Front, Back, Left, Right); //Contact_Status method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                        SD.Contact_Status(SD.FindShortestDistance(Front, Back, Left, Right)); //Contact Status method called on the SD subclass, this is method overriding
                        SD.ClinicAppointment(SD.FindShortestDistance(Front, Back, Left, Right)); //Clinic Appointment method called on SD subclass
                    } else {
                        System.out.println("\nThe capacity of the area is full. You are not allowed to enter the area. You need to wait " + Choice2.SpotPermittedAverageTime + " minutes."); //User is asked to wait SpotPermittedAverageTime
                        System.out.print("\nDo you want to wait? (y/n): ");
                        String waitchoice = sc.next();
                        if (waitchoice.equals("y") || waitchoice.equals("Y")) { //Check user input if it is equal to 'y' or 'yes'
                            System.out.println("\n" + Choice2.SpotPermittedAverageTime + " minutes has passed, you are now permitted to enter."); //Assume that the SpotPermittedAverageTime has passed
                            System.out.println("Please enter the distance you are keeping from people around you from all 4 directions.");

                            System.out.print("\nFront: ");
                            float Front = sc.nextFloat(); // User input where distance is entered from Front
                            System.out.print("\nBack: ");
                            float Back = sc.nextFloat(); // User input where distance is entered from Back
                            System.out.print("\nLeft: ");
                            float Left = sc.nextFloat(); // User input where distance is entered from Left
                            System.out.print("\nRight: ");
                            float Right = sc.nextFloat(); // User input where distance is entered from Right

                            SD.Direction(Front, Back, Left, Right); //Direction method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                            SD.Contact_Status(Front, Back, Left, Right); //Contact_Status method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                            SD.Contact_Status(SD.FindShortestDistance(Front, Back, Left, Right)); //Contact Status method called on the SD subclass, this is method overriding
                            SD.ClinicAppointment(SD.FindShortestDistance(Front, Back, Left, Right)); //Clinic Appointment method called on SD subclass
                        }
                    }
                }
                case 3 -> {
                    Restricted_Spots.Area3 Choice3 = new Restricted_Spots.Area3();
                    Choice3.Display();

                    if ((Choice3.permission(Choice3.NumberOfPeople, Choice3.SpotMaximumCapacity)) == 1) { //Permission is called on Choice1 object to check if maximum capacity of area has been reached or not
                        System.out.println("""
                                                                
                                You are allowed to enter the area.
                                Please enter the distance you are keeping from people around you from all 4 directions.""");
                        System.out.print("\nFront: ");
                        float Front = sc.nextFloat(); // User input where distance is entered from Front
                        System.out.print("\nBack: ");
                        float Back = sc.nextFloat(); // User input where distance is entered from Back
                        System.out.print("\nLeft: ");
                        float Left = sc.nextFloat(); // User input where distance is entered from Left
                        System.out.print("\nRight: ");
                        float Right = sc.nextFloat(); // User input where distance is entered from Right

                        SD.Direction(Front, Back, Left, Right); //Direction method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                        SD.Contact_Status(Front, Back, Left, Right); //Contact_Status method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                        SD.Contact_Status(SD.FindShortestDistance(Front, Back, Left, Right)); //Contact Status method called on the SD subclass, this is method overriding
                        SD.ClinicAppointment(SD.FindShortestDistance(Front, Back, Left, Right)); //Clinic Appointment method called on SD subclass
                    } else {
                        System.out.println("\nThe capacity of the area is full. You are not allowed to enter the area. You need to wait " + Choice3.SpotPermittedAverageTime + " minutes."); //User is asked to wait SpotPermittedAverageTime
                        System.out.print("\nDo you want to wait? (y/n): ");
                        String waitchoice = sc.next();
                        if (waitchoice.equals("y") || waitchoice.equals("Y")) { //Check user input if it is equal to 'y' or 'yes'
                            System.out.println("\n" + Choice3.SpotPermittedAverageTime + " minutes has passed, you are now permitted to enter."); //Assume that the SpotPermittedAverageTime has passed
                            System.out.println("Please enter the distance you are keeping from people around you from all 4 directions.");

                            System.out.print("\nFront: ");
                            float Front = sc.nextFloat(); // User input where distance is entered from Front
                            System.out.print("\nBack: ");
                            float Back = sc.nextFloat(); // User input where distance is entered from Back
                            System.out.print("\nLeft: ");
                            float Left = sc.nextFloat(); // User input where distance is entered from Left
                            System.out.print("\nRight: ");
                            float Right = sc.nextFloat(); // User input where distance is entered from Right

                            SD.Direction(Front, Back, Left, Right); //Direction method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                            SD.Contact_Status(Front, Back, Left, Right); //Contact_Status method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                            SD.Contact_Status(SD.FindShortestDistance(Front, Back, Left, Right)); //Contact Status method called on the SD subclass, this is method overriding
                            SD.ClinicAppointment(SD.FindShortestDistance(Front, Back, Left, Right)); //Clinic Appointment method called on SD subclass
                        }
                    }
                }
                case 4 -> {
                    Restricted_Spots.Area4 Choice4 = new Restricted_Spots.Area4();
                    Choice4.Display();

                    if ((Choice4.permission(Choice4.NumberOfPeople, Choice4.SpotMaximumCapacity)) == 1) { //Permission is called on Choice1 object to check if maximum capacity of area has been reached or not
                        System.out.println("""
                                                                
                                You are allowed to enter the area.
                                Please enter the distance you are keeping from people around you from all 4 directions.""");
                        System.out.print("\nFront: ");
                        float Front = sc.nextFloat(); // User input where distance is entered from Front
                        System.out.print("\nBack: ");
                        float Back = sc.nextFloat(); // User input where distance is entered from Back
                        System.out.print("\nLeft: ");
                        float Left = sc.nextFloat(); // User input where distance is entered from Left
                        System.out.print("\nRight: ");
                        float Right = sc.nextFloat(); // User input where distance is entered from Right

                        SD.Direction(Front, Back, Left, Right); //Direction method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                        SD.Contact_Status(Front, Back, Left, Right); //Contact_Status method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                        SD.Contact_Status(SD.FindShortestDistance(Front, Back, Left, Right)); //Contact Status method called on the SD subclass, this is method overriding
                        SD.ClinicAppointment(SD.FindShortestDistance(Front, Back, Left, Right)); //Clinic Appointment method called on SD subclass
                    } else {
                        System.out.println("\nThe capacity of the area is full. You are not allowed to enter the area. You need to wait " + Choice4.SpotPermittedAverageTime + " minutes."); //User is asked to wait SpotPermittedAverageTime
                        System.out.print("\nDo you want to wait? (y/n): ");
                        String waitchoice = sc.next();
                        if (waitchoice.equals("y") || waitchoice.equals("Y")) { //Check user input if it is equal to 'y' or 'yes'
                            System.out.println("\n" + Choice4.SpotPermittedAverageTime + " minutes has passed, you are now permitted to enter."); //Assume that the SpotPermittedAverageTime has passed
                            System.out.println("Please enter the distance you are keeping from people around you from all 4 directions.");

                            System.out.print("\nFront: ");
                            float Front = sc.nextFloat(); // User input where distance is entered from Front
                            System.out.print("\nBack: ");
                            float Back = sc.nextFloat(); // User input where distance is entered from Back
                            System.out.print("\nLeft: ");
                            float Left = sc.nextFloat(); // User input where distance is entered from Left
                            System.out.print("\nRight: ");
                            float Right = sc.nextFloat(); // User input where distance is entered from Right

                            SD.Direction(Front, Back, Left, Right); //Direction method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                            SD.Contact_Status(Front, Back, Left, Right); //Contact_Status method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                            SD.Contact_Status(SD.FindShortestDistance(Front, Back, Left, Right)); //Contact Status method called on the SD subclass, this is method overriding
                            SD.ClinicAppointment(SD.FindShortestDistance(Front, Back, Left, Right)); //Clinic Appointment method called on SD subclass
                        }
                    }
                }
                case 5 -> {
                    Restricted_Spots.Area5 Choice5 = new Restricted_Spots.Area5();
                    Choice5.Display();

                    if ((Choice5.permission(Choice5.NumberOfPeople, Choice5.SpotMaximumCapacity)) == 1) { //Permission is called on Choice1 object to check if maximum capacity of area has been reached or not
                        System.out.println("""
                                                                
                                You are allowed to enter the area.
                                Please enter the distance you are keeping from people around you from all 4 directions.""");
                        System.out.print("\nFront: ");
                        float Front = sc.nextFloat(); // User input where distance is entered from Front
                        System.out.print("\nBack: ");
                        float Back = sc.nextFloat(); // User input where distance is entered from Back
                        System.out.print("\nLeft: ");
                        float Left = sc.nextFloat(); // User input where distance is entered from Left
                        System.out.print("\nRight: ");
                        float Right = sc.nextFloat(); // User input where distance is entered from Right

                        SD.Direction(Front, Back, Left, Right); //Direction method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                        SD.Contact_Status(Front, Back, Left, Right); //Contact_Status method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                        SD.Contact_Status(SD.FindShortestDistance(Front, Back, Left, Right)); //Contact Status method called on the SD subclass, this is method overriding
                        SD.ClinicAppointment(SD.FindShortestDistance(Front, Back, Left, Right)); //Clinic Appointment method called on SD subclass
                    } else {
                        System.out.println("\nThe capacity of the area is full. You are not allowed to enter the area. You need to wait " + Choice5.SpotPermittedAverageTime + " minutes."); //User is asked to wait SpotPermittedAverageTime
                        System.out.print("\nDo you want to wait? (y/n): ");
                        String waitchoice = sc.next();
                        if (waitchoice.equals("y") || waitchoice.equals("Y")) { //Check user input if it is equal to 'y' or 'yes'
                            System.out.println("\n" + Choice5.SpotPermittedAverageTime + " minutes has passed, you are now permitted to enter."); //Assume that the SpotPermittedAverageTime has passed
                            System.out.println("Please enter the distance you are keeping from people around you from all 4 directions.");

                            System.out.print("\nFront: ");
                            float Front = sc.nextFloat(); // User input where distance is entered from Front
                            System.out.print("\nBack: ");
                            float Back = sc.nextFloat(); // User input where distance is entered from Back
                            System.out.print("\nLeft: ");
                            float Left = sc.nextFloat(); // User input where distance is entered from Left
                            System.out.print("\nRight: ");
                            float Right = sc.nextFloat(); // User input where distance is entered from Right

                            SD.Direction(Front, Back, Left, Right); //Direction method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                            SD.Contact_Status(Front, Back, Left, Right); //Contact_Status method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                            SD.Contact_Status(SD.FindShortestDistance(Front, Back, Left, Right)); //Contact Status method called on the SD subclass, this is method overriding, this is the Mask Rules
                            SD.ClinicAppointment(SD.FindShortestDistance(Front, Back, Left, Right)); //Clinic Appointment method called on SD subclass
                        }
                    }
                }
                case 6 -> {
                    Restricted_Spots.Area6 Choice6 = new Restricted_Spots.Area6();
                    Choice6.Display();

                    if ((Choice6.permission(Choice6.NumberOfPeople, Choice6.SpotMaximumCapacity)) == 1) { //Permission is called on Choice1 object to check if maximum capacity of area has been reached or not
                        System.out.println("""
                                                                
                                You are allowed to enter the area.
                                Please enter the distance you are keeping from people around you from all 4 directions.""");
                        System.out.print("\nFront: ");
                        float Front = sc.nextFloat(); // User input where distance is entered from Front
                        System.out.print("\nBack: ");
                        float Back = sc.nextFloat(); // User input where distance is entered from Back
                        System.out.print("\nLeft: ");
                        float Left = sc.nextFloat(); // User input where distance is entered from Left
                        System.out.print("\nRight: ");
                        float Right = sc.nextFloat(); // User input where distance is entered from Right

                        SD.Direction(Front, Back, Left, Right); //Direction method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                        SD.Contact_Status(Front, Back, Left, Right); //Contact_Status method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                        SD.Contact_Status(SD.FindShortestDistance(Front, Back, Left, Right)); //Contact Status method called on the SD subclass, this is method overriding, this is the Mask Rules
                        SD.ClinicAppointment(SD.FindShortestDistance(Front, Back, Left, Right)); //Clinic Appointment method called on SD subclass
                    } else {
                        System.out.println("\nThe capacity of the area is full. You are not allowed to enter the area. You need to wait " + Choice6.SpotPermittedAverageTime + " minutes."); //User is asked to wait SpotPermittedAverageTime
                        System.out.print("\nDo you want to wait? (y/n): ");
                        String waitchoice = sc.next();
                        if (waitchoice.equals("y") || waitchoice.equals("Y")) { //Check user input if it is equal to 'y' or 'yes'
                            System.out.println("\n" + Choice6.SpotPermittedAverageTime + " minutes has passed, you are now permitted to enter."); //Assume that the SpotPermittedAverageTime has passed
                            System.out.println("Please enter the distance you are keeping from people around you from all 4 directions.");

                            System.out.print("\nFront: ");
                            float Front = sc.nextFloat(); // User input where distance is entered from Front
                            System.out.print("\nBack: ");
                            float Back = sc.nextFloat(); // User input where distance is entered from Back
                            System.out.print("\nLeft: ");
                            float Left = sc.nextFloat(); // User input where distance is entered from Left
                            System.out.print("\nRight: ");
                            float Right = sc.nextFloat(); // User input where distance is entered from Right

                            SD.Direction(Front, Back, Left, Right); //Direction method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                            SD.Contact_Status(Front, Back, Left, Right); //Contact_Status method called on the SD subclass, SD subclass inheriting the method from Dynamic Distancing class
                            SD.Contact_Status(SD.FindShortestDistance(Front, Back, Left, Right)); //Contact Status method called on the SD subclass, this is method overriding, this is the Mask Rules
                            SD.ClinicAppointment(SD.FindShortestDistance(Front, Back, Left, Right)); //Clinic Appointment method called on SD subclass
                        }
                    }
                }
                case 7 -> System.exit(0); //Case 7, exits the program
                default -> System.out.println("\nPlease enter a valid number."); //Default switch case given that the user enters a number outside 1-7
            }
            System.out.print("\nDo you want to visit another area? (y/n): ");
            choice = sc.next(); //User input to take in the users choice
        } while (Objects.equals(choice, "y") || Objects.equals(choice, "Y")); //While statement that checks if the user wants to visit another area of the hospital or not
        System.out.println("\nThank you. Good Bye.");
    }
}