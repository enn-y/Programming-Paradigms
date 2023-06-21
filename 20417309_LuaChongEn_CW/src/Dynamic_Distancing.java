import java.time.Month; //importing 4 packages
import java.util.Objects;
import java.util.Scanner;
import java.time.LocalDate;

public class Dynamic_Distancing {
    public static void Direction(float front, float back, float left, float right){ //Method called Direction, which takes four float parameters representing distances in meters in the front, back, left, and right directions.
        String[] direction = {"FRONT", "BACK", "LEFT", "RIGHT"}; //String array called direction with 4 elements: "FRONT", "BACK", "LEFT", and "RIGHT".
        System.out.println("\033[1m\nDynamic Distancing instructions:\033[0m"); //Uses ANSI escape codes that formats the string to bold.
        if (front < 1) { //Checks if the distance in front is less than 1 meter.
            front = 1 - front; //If the distance in front is less than 1 meter, this line calculates the distance to move away from the front.
            System.out.println(" - Please move away from the " + direction[0] + " by " + String.format("%.1f", front) + " meters."); //Uses indexing to choose the direction, also uses String.format to set the value to 1 decimal place
        }
        if (back < 1) {  //Checks if the distance in back is less than 1 meter.
            back = 1 - back; //If the distance in back is less than 1 meter, this line calculates the distance to move away from the back.
            System.out.println(" - Please move away from the " + direction[1] +  " by " + String.format("%.1f", back) + " meters."); //Uses indexing to choose the direction, also uses String.format to set the value to 1 decimal place
        }
        if (left < 1) { //Checks if the distance in left is less than 1 meter.
            left = 1 - left; //If the distance in left is less than 1 meter, this line calculates the distance to move away from the left.
            System.out.println(" - Please move away from the " + direction[2] +  " by " + String.format("%.1f", left) + " meters."); //Uses indexing to choose the direction, also uses String.format to set the value to 1 decimal place
        }
        if (right < 1) { //Checks if the distance in right is less than 1 meter.
            right = 1 - right; //If the distance in right is less than 1 meter, this line calculates the distance to move away from the right.
            System.out.println(" - Please move away from the " + direction[3] +  " by " + String.format("%.1f", right) + " meters."); //Uses indexing to choose the direction, also uses String.format to set the value to 1 decimal place
        }
        if (front >= 1 && back >= 1 && left >= 1 && right >= 1){ //Checks if all 4 distances are greater or equal to 1 meter.
            System.out.println(" - You are practicing Dynamic Distancing Rules.");
        }
    }

    public static void Contact_Status(float front, float back, float left, float right){ //Method called contact status to determine the contact status of the user after a series of if else statements
        String Red = "\u001B[31m"; //Red color code, escape sequence that represents ANSI color code
        String Yellow = "\u001B[33m"; //Yellow color code, escape sequence that represents ANSI color code
        String Green = "\u001B[32m"; //Green color code, escape sequence that represents ANSI color code
        String Reset = "\u001B[0m"; //Reset color code, escape sequence that represents ANSI color code
        String[] Status = {"HIGH RISK", "CASUAL CONTACT", "NORMAL"}; //String array called status with 3 elements: "HIGH RISK", "CASUAL CONTACT", "NORMAL".
        if(front < 0.5 || back < 0.5 || left < 0.5 || right < 0.5){ // Checks if any of the distances are less than 0.5 meters.
            System.out.println(Red + "\nCONTACT STATUS: " + Status[0] + Reset + "\nPlease continue to follow the Dynamic Distancing Rules."); //Uses indexing to choose the status
        }
        else if(front < 1 || back < 1 || left < 1 || right < 1){ // Checks if any of the distances are between 0.5 and 1 meter.
            System.out.println(Yellow + "\nCONTACT STATUS: " + Status[1] + Reset + "\nPlease continue to follow the Dynamic Distancing Rules."); //Uses indexing to choose the status
        }
        else if(front >= 1 || back >= 1 || left >= 1 || right >= 1){ // Checks if all the distances are greater than or equal to 1 meter.
            System.out.println(Green + "\nCONTACT STATUS: " + Status[2] + Reset + "\nYou are safe in Dynamic Distancing!."); //Uses indexing to choose the status
        }
        System.out.println("""
                
                Contact Rules: 1) High Risk: At-least one person is present less than 0.5 meters from you.
                               2) Casual Contact: At-least one person is present less than 1 meter from you but greater than 0.5 meters.
                               3) Normal: Nobody within 1 meter of you."""); // """ syntax is used to create multi-line string for easier reading
    }

    public static void Contact_Status(float direction){ //Method also called contact status to determine the mask rules for the user (Extraordinary Feature), uses method overloading and FindShortestDistance method as a parameter
        String Red = "\u001B[31m"; //Red color code, escape sequence that represents ANSI color code
        String Yellow = "\u001B[33m"; //Yellow color code, escape sequence that represents ANSI color code
        String Green = "\u001B[32m"; //Green color code, escape sequence that represents ANSI color code
        String Reset = "\u001B[0m"; //Reset color code, escape sequence that represents ANSI color code
        if(direction < 0.5){  //If distance is less than 0.5 meters then user will be asked to wear a N95 specific mask
            System.out.println(Red + "\nMASK RULES: Please wear a N95 Specific mask." + Reset);
        }
        else if(direction < 1.0){ //If distance is between 0.5 and 1 meter then user will be asked to wear a medical mask
            System.out.println(Yellow + "\nMASK RULES: Please wear a medical mask." + Reset);
        }
        else if(direction >= 1.0){ //If distance is greater than 1 meter then user will be asked to wear a mask
            System.out.println(Green + "\nMASK RULES: You are free to choose to wear a mask or not." + Reset);
        }
    }

    public static float FindShortestDistance(float front, float back, float left, float right){ //Method called FindShortestDistance used to determine the shortest distance and used to determine the Mask Rules for the user, it is used as a parameter in Contact Status method
        float ShortestDistance = front; //Set the shortest distance to the front distance initially
        if (back < ShortestDistance) {  //If the back distance is shorter than the current shortest distance
            ShortestDistance = back; //Change the value of the shortest distance if true
        }
        if (left < ShortestDistance) { //If the left distance is shorter than the current shortest distance
            ShortestDistance = left; //Change the value of the shortest distance if true
        }
        if (right < ShortestDistance) { //If the right distance is shorter than the current shortest distance
            ShortestDistance = right; //Change the value of the shortest distance if true
        }
        return ShortestDistance; //return the Shortest Distance after a series of if statements to determine the shortest distance
    }

    public static void ClinicAppointment(float distance){ //Method called Clinic Appointment where it determines if the user needs to book a hospital appointment or not
        if(distance < 0.5){ //If the distance is less than 0.5 meters, the user is deemed as High Risk and a hospital appointment will automatically be booked
            System.out.println("\nHospital Appointment: Since you are deemed as High Risk, we insist that you book an appointment in the hospital to check for any possible symptoms.");
            LocalDate currentdate = LocalDate.now();
            int year = currentdate.getYear();
            Month month = currentdate.getMonth();
            int currentDay = currentdate.getDayOfMonth();
            int day = (int) (Math.random()*(30-currentDay+1)+currentDay);
            System.out.println("Appointment date: " + year + "-" + month + "-" + day);
        }
        else if(distance < 1.0){ //If the distance is between 0.5 and 1.0 meters, the user is deemed as Close Contact and is suggested to book an hospital appointment
            System.out.println("\nHospital Appointment: Since you are deemed as Close Contact, we suggest you book an appointment in the hospital to check for any possible symptoms.");
            System.out.print("\nDo you want to book an appointment? (y/n): "); //The user is asked to input their choice on whether to book an appointment or not
            Scanner appointment = new Scanner(System.in);
            String Choice = appointment.next();
            if(Objects.equals(Choice, "y") || Objects.equals(Choice, "Y")){ // If the user inputs "y", an appointment date is generated randomly within the next 30 days
                LocalDate currentdate = LocalDate.now();
                int year = currentdate.getYear();
                Month month = currentdate.getMonth();
                int currentDay = currentdate.getDayOfMonth();
                int day = (int) (Math.random()*(30-currentDay+1)+currentDay);
                System.out.println("Appointment date: " + year + "-" + month + "-" + day);
            }
            else{
                System.out.println("Please ensure that you are safe. Thank you.");
            }
        }
        else if(distance >= 1.0){ //If the distance is greater than or equal to 1.0, the user is deemed as Normal Status and does not need to book an hospital appointment
            System.out.println("\nHospital Appointment: Since you are deemed as Normal Status, you don't need to book an appointment in the hospital");
        }
    }
}