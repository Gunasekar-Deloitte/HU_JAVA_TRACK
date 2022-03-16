package loops_assignment_solution;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=number;j>i;j--){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=number-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=number-1;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
