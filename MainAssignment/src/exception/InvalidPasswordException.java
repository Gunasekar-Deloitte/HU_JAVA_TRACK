package exception;

public class InvalidPasswordException extends Exception{
    int pcv =0;
    public InvalidPasswordException(int cv){
        super("Invalid password");
        pcv = cv;
    }
    public  String printMessage(){
        switch (pcv){
            case 1:
                return (" Password length should be 5 to 10");
            case 2:
                return ("Password should contain atleast one digit(0-9)");
            case 3:
                return ("Password should contain at least one Special charcter");
            case 4:
                return ("Password should contain at least one upper case");
            case 5:
                return ("Password should contail atleast one lowercase");
            case 6:
                return ("Age cannot be less than 18 0r greater than 90");
            case 7:
                return ("Salary cannot less than or equal to Zero");
            case 8:
                return ("phone number must be 10 digit");
        }
        return (" ");
    }
}
