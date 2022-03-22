package main_assignment_java;

import exception.InvalidPasswordException;
import exception.Password;

import java.io.*;
import java.util.Scanner;

import static main_assignment_java.Main.loginOrRegister;

public class Register {
    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Welcome to Register Page--- ");
        System.out.println("Enter Username:- ");
        String username = scanner.next();
        String file="src\\Username_Password.csv";
        BufferedReader reader=null;
        String line="";
        try {
            reader=new BufferedReader(new FileReader(file));
            while((line=reader.readLine())!=null){
                String[] row=line.split(",");
                if(row[0].equals(username)){
                    System.out.println("Username already Registered");
                    System.out.println("Login or Register again");
                    register();
                }
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
        System.out.println("Enter Password:- ");
        String password = scanner.next();
        try {
            Password.isValid(password);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
            System.out.println(e.printMessage());
            System.out.println("Enter valid password");
            register();
        }
        System.out.println("Re-enter Password");
        String reenterpassword = scanner.next();
        if(!(password).equals(reenterpassword)){
            System.out.println("Both password must be same");
            register();
        }
        else{
            addPasswordAndUserName(username, password);
            System.out.println("Registration successful");
            loginOrRegister();
        }
    }
    public void addPasswordAndUserName(String name, String password)  {

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("src\\Username_Password.csv",true));
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuffer file =new StringBuffer("");
        file.append(name);
        file.append(",");
        file.append(password);
        file.append("\n");
        pw.write(file.toString());
        pw.close();
    }
}
