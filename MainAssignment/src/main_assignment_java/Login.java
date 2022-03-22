package main_assignment_java;


import exception.InvalidPasswordException;
import exception.Password;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
   // ListUserData listdata = new ListUserData();
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Welcome to Login Page--");

        System.out.println("Enter Username");
        String userName = scanner.next();

        System.out.println("Enter Password");
        String password = scanner.next();

        String file="src\\Username_Password.csv";
        BufferedReader reader=null;
        String line="";
        int c=0;
        try {
            reader=new BufferedReader(new FileReader(file));
            while((line=reader.readLine())!=null){
                String[] row=line.split(",");
                if(row[0].equals(userName)){
                    c++;
                    if(row[1].equals(password)){
                        System.out.println("Login Successful");
                        choice();
                    }
                    else{
                        System.out.println("---Password did not match---");
                        System.out.println("Login Again");
                        login();
                    }
                }
            }
            if(c==0){
                System.out.println("Username not found, Please register again or try different Username");
                login();
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

        try {
            Password.isValid(password);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
            System.out.println(e.printMessage());
            System.out.println("Enter valid password");
            login();
        }
        System.out.println("Login successful");
    }

    public void choice(){
        Scanner scanner = new Scanner(System.in);
        Function function = new Function();
        System.out.println("******Welcome to User Database*******");
        System.out.println("1. Add User Data ");
        System.out.println("2. List User Data ");
        System.out.println("3. Update User Data ");
        System.out.println("4. Delete User Data ");
        System.out.println("5. Exit ");

        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                function.addUserData();
                System.out.println("User Details added successfully");
                break;
            case 2:
                ListUserData.displayUserData();
                System.out.println("User Data displays successfully");
            case 3:
                System.out.println("Update User Data");
            case 4:
                System.out.println("Delete User Data");
            case 5:
                System.out.println("Exit");
                System.exit(0);
            default:
                System.out.println("Invalid Input");
        }
    }
}
