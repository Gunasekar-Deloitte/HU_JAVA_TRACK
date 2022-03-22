package main_assignment_java;

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Main.loginOrRegister();
    }
    public static void loginOrRegister() {
        Scanner scanner = new Scanner(System.in);
        Register reg = new Register();
        Login log = new Login();

        System.out.println("******Welcome to User Database*******");
        System.out.println("1.Login");
        System.out.println("2.Register");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                log.login();
                log.choice();
                break;
            case 2:
                reg.register();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}