package arrays_and_strings;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1 = scan.nextLine();
        System.out.println("Enter String 2");
        String str2 = scan.nextLine();
        System.out.println("Enter the shuffle array");
        String str3 = scan.nextLine();
        System.out.println("the returned value is " + validOrInvalid(str1, str2, str3));
    }
    private static String validOrInvalid(String str1, String str2, String str3){
        int i=0, j=0, k=0;
        if(str1.length() + str2.length() != str3.length()){
            return "invalid";
        }
        while (k < str3.length()) {
            if(i< str1.length() && str1.charAt(i) == str3.charAt(k)){
                i++;
            }
            else if(j< str2.length() && str2.charAt(j) == str3.charAt(k)){
                j++;
            }
            else {
                return "invalid";
            }
            k++;
        }
        if(!(i == str1.length() && j == str2.length() && k == str3.length())){
            return "invalid";
        }
        return "valid";
    }
}
