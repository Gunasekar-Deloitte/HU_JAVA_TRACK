package exception_handling;

import java.util.Scanner;

public class Arithmetic_Exception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = scan.nextInt();
        System.out.println("Enter the number:");
        int b = scan.nextInt();
        try{
            System.out.println("Try block");
            int res = a/b;
            System.out.println(res);
        }
        catch (ArithmeticException e){
            System.out.println("catch block");
            System.out.println("ArithmeticException : Number divided by Zero ");
        }

        finally {
            System.out.println("Thank you");
        }
        int res = a+b;
        System.out.println("The sum of two numbers is " + res);
    }
}
