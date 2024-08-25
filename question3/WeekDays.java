package question3;

import java.util.Scanner;

public class WeekDays {
    String [] weekdays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    public static void main(String[] args) {
//       Scanner Method
        Scanner scanner = new Scanner(System.in);

//        Creating a Object
        WeekDays weekday = new WeekDays();

        System.out.println("Enter a number");
        int day = scanner.nextInt();

//        Creating a Exception
        try {
            System.out.println("The day is " + weekday.weekdays[day]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("enter a number between 0-6");
        }
    }
}
