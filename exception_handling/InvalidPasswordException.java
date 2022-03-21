package exception_handling;

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
        }
        return (" ");
    }
}
