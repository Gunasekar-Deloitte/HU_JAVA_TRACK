package main_assignment_java;

import exception.InvalidPasswordException;
import exception.Password;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Function {
        static Scanner scanner = new Scanner(System.in);
        static Password validation = new Password();
        public void addUserData() {
            System.out.println("Enter the User-Id: ");
            String Userid = scanner.nextLine();
            System.out.println("Enter the Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter the Age: ");
            int age = addAge();
            System.out.println("Enter the Company-Name: ");
            String company_name = scanner.nextLine();
            System.out.println("Enter the Designation: ");
            String designation = scanner.nextLine();
            System.out.println("Enter the Salary: ");
            int salary = addSalary();
            System.out.println("Enter the Address: ");
            String address = scanner.nextLine();
            System.out.println("Enter the Phone Number: ");
            long phonenumber = addPhoneNumber();
            saveUserData(Userid, name, age, company_name, designation, salary, address, phonenumber);
    }

    public static int addAge(){
        //System.out.println("Enter the Age: ");
        int age = Integer.parseInt(scanner.next());
        scanner.nextLine();
        try{
            validation.isValidAge(age);
        }catch (InvalidPasswordException e){
            System.out.println(e.getMessage());
            System.out.println(e.printMessage());
            addAge();
        }
        return age;
    }
    public static int addSalary(){
        //System.out.println("Enter the Salary: ");
        int salary =Integer.parseInt(scanner.next());
        scanner.nextLine();
        try{
            validation.isValidSalary(salary);
        }
        catch (InvalidPasswordException e){
            System.out.println(e.getMessage());
            System.out.println(e.printMessage());
            addSalary();
        }
        return salary;
    }
    public static long addPhoneNumber(){
        //System.out.println("Enter the Phone Number: ");

        long phonenumber = Long.parseLong(scanner.next());
        scanner.nextLine();
        try{
            validation.isValidPhoneNumber(phonenumber);
        }catch (InvalidPasswordException e){
            System.out.println(e.getMessage());
            System.out.println(e.printMessage());
            addPhoneNumber();
        }
        return phonenumber;
    }
    public  void saveUserData(String userid, String name, int age, String company_name, String designation, int salary, String address, long phonenumber) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("src\\UserData.csv", true));
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuffer file =new StringBuffer("");
        file.append("User_Id: "+userid+","+"Name: "+name+","+"Age: "+age+","+"Company_name: "+company_name+","
                +"Designation: "+designation+","+"Salary: "+salary+","+"Address: "+address+","+"PhoneNumber: "+phonenumber);
        file.append("\n");
        pw.write(file.toString());
        pw.close();

    }
}
