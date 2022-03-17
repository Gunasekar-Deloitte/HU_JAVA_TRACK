package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            list.add(scan.next());
        }
        list.get(0).toLowerCase();
        list.get(1).toLowerCase();
        char[] arr1 = list.get(0).toCharArray();
        char[] arr2 = list.get(1).toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("anagram");
        } else {
            System.out.println("Not a anagram");
        }
    }
}
