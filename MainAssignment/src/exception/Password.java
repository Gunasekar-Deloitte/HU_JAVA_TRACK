package exception;

import java.util.Scanner;

public class Password {
    public static void isValid(String psw)
            throws InvalidPasswordException {
        if (!((psw.length() >= 5) && (psw.length() <= 10))) {
            throw new InvalidPasswordException(1);
        }

        if (true) {
            int c = 0;
            for (int i = 0; i < 9; i++) {
                String str1 = Integer.toString(i);

                if (psw.contains(str1)) {
                    c = 1;
                }
            }
            if (c == 0) {
                throw new InvalidPasswordException(2);
            }
        }
        if (!(psw.contains("@") || psw.contains("#") || psw.contains("&") || psw.contains("%") || psw.contains("*") || psw.contains("!"))) {
            throw new InvalidPasswordException(3);
        }
        if (true) {
            int c = 0;
            for (int i = 65; i <= 90; i++) {
                char ch = (char) i;
                String str1 = Character.toString(ch);
                if (psw.contains(str1)) {
                    c = 1;
                }
            }
            if (c == 0) {
                throw new InvalidPasswordException(4);
            }
        }
            if (true) {
                int co = 0;
                for (int i = 90; i <= 122; i++) {
                    char ch = (char) i;
                    String str1 = Character.toString(ch);
                    if (psw.contains(str1)) {
                        co = 1;
                    }
                }
                if (co == 0) {
                    throw new InvalidPasswordException(5);
                }
            }
        }
    public void isValidAge(int age) throws InvalidPasswordException{
        if(age<18 || age>90) {
            throw new InvalidPasswordException(6);
        }
    }

    public void isValidSalary(int salary) throws InvalidPasswordException {
        if(salary<=0){
            throw  new InvalidPasswordException(7);
        }
    }

    public void isValidPhoneNumber(long phonenumber) throws InvalidPasswordException{
        if((String.valueOf(phonenumber).length()<10) || (String.valueOf(phonenumber).length()>10)){
            throw new InvalidPasswordException(8);
        }
    }
}