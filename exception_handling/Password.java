package exception_handling;

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
    }
        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the password");
            String str = scan.next();
            try {
                System.out.println("Password " + str + "valid");
                isValid(str);
                System.out.println("Valid password");
            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
                System.out.println(e.printMessage());
            }
        }
}
