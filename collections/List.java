package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter number of elements you want to add in list");
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            list.add(scan.next());
        }
        System.out.println("list elements are:"+list);
        Collections.reverse(list);
        System.out.println("Reverse elements in list:"+list);
    }
}
