package question5;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
//        Scanner Method
        Scanner scanner = new Scanner(System.in);
//        Creating Object for Stack Method
       Stack<Integer> integerStack = new Stack<>();

        for(int i =0; i<=2; i++) {
           System.out.println("Enter number to add ");
           Integer num = scanner.nextInt();
           integerStack.push(num);
       }
        System.out.println(integerStack.pop());

    }
}
