package main_assignment_java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ListUserData {
    public static void displayUserData(){
        Login login = new Login();
        String file="src\\UserData.csv";
        BufferedReader reader=null;
        String line="";
        System.out.println("-----User DataBase Records-----");
        try {
            reader=new BufferedReader(new FileReader(file));
            while((line=reader.readLine())!=null){
                String[] r=line.split(",");
                for(String index : r){
                    System.out.printf("%-30s\n",index);
                }
                System.out.println();
                System.out.println("----------------------------------------------");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("User data displayed Successfully");
        System.out.println("____________________________________________________________");
        login.choice();
    }
}
