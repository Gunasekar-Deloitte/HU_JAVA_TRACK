package arrays_and_strings;

import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int number=scan.nextInt();
        int[] array=new int[number];
        System.out.println("Enter the array elements");
        for(int i=0;i<number;i++){
                array[i]=scan.nextInt();
        }
        int ct=0;
        for(int i=0;i<number;i++){
            for(int j=i;j<number;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+array[k];
                }
                if(sum<0){
                    ct++;
                }
            }
        }
        System.out.println(ct);
    }
}
