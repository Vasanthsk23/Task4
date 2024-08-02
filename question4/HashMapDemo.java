package question4;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Student student1 =new Student();

        for(int i = 0; i<2; i++) {
            System.out.println("Enter the name for student " + (i+1));
            String name = scanner.nextLine();

            System.out.println("Enter the grade for student " + (i+1));
            Integer grade = scanner.nextInt();
            scanner.nextLine();

            student1.addStudent(name, grade);
        }


        System.out.println("Enter a name to remove from map");
        String name = scanner.nextLine();
        student1.removeStudent(name);

        System.out.println("Enter a name to display the grade");
        String name1 = scanner.nextLine();
        Integer grade = student1.displayGrade(name1);
        System.out.println("grade is : " + grade);


    }
}
