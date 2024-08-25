package question2;

import question1.AgeNotWithinRangeException;

import java.util.Scanner;

public class Voter {

    private String voterID;
    private String name;
    private int age;

//  Empty Constructor
    public Voter(){

    }

//    Parameterized constructor
    public Voter(String voterID, String name, int age){
        this.voterID = voterID;
        this.name = name;

//      Creating a Exception
        try {
            if (age >= 18) {
                this.age = age;
            }else {
                throw new AgeNotWithinRangeException("age should be greater than 18 or equal to");
            }

        }catch (AgeNotWithinRangeException e){
            System.out.println(e.getMessage());
        }
    }

//  Getter & Setter Method
    public String getVoterID() {
        return this.voterID;
    }

    public void setVoterID(String voterID) {
        this.voterID = voterID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Voter ID ");
        String voterID = scanner.nextLine();

        System.out.println("Enter the name ");
        String name = scanner.nextLine();

        System.out.println("Enter the age ");
        int age = scanner.nextInt();

        Voter voter = new Voter(voterID, name, age);

    }
}
