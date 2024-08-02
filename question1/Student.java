package question1;

import java.util.Scanner;

public class Student {

    private String rollNo;
    private String name;
    private int age;
    private String course;

   public  Student(){

    }

    public Student(String rollNo, String name, int age, String course){
       this.rollNo = rollNo;
       this.name = name;
       this.age = age;
       this.course = course;
    }

    public String getRollNo(){
       return this.rollNo;
    }

    public String getName(){
       return this.name;
    }

    public int getAge(){
       return this.age;
    }

    public String getCourse(){
       return this.course;
    }

    public void setRollNo(String rollNo){
       this.rollNo = rollNo;
    }

    public void setName(String name){
       this.name =name;
    }

    public void setAge(int age){
       this.age = age;
    }

    public void setCourse(String course){
       this.course = course;
    }




    public static void main(String[] args) {
//       Student [] students = new Student[3];
        Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the rollno: ");
    String rollNo = scanner.nextLine();


    System.out.println("Enter the Name: ");
    String name = scanner.nextLine();
    try {
        String pattern = "[a-zA-Z]";
        if (!name.matches(pattern)) {
            throw new NameNotValidException("Name should not contain number or special character!!!!");
        }
    }catch (NameNotValidException nameExp){
            System.out.println(nameExp.getMessage());
        }
        System.out.println("Enter the Age: ");
        int age = scanner.nextInt();
    try{

    if(age < 15 || age > 21){
        throw new AgeNotWithinRangeException("Enter a age between 15 to 21!!!!");
    }
    }catch (AgeNotWithinRangeException ageExp){
        System.out.println(ageExp.getMessage());
    }

        scanner.nextLine();

    System.out.println("Enter the course");
    String course = scanner.nextLine();


    Student student = new Student(rollNo, name, age, course);


        System.out.println("");
    }
}