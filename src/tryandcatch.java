public class tryandcatch {
    public static void main(String[] args){
        try {
            ageChecking(17);
            // UserDefinedException is a class, creating a object using UserDefinedException class and name it e
        }catch (UserDefinedException e){
            // e is a Object e.message
            System.out.println(e.message);
        }
    }

    // must use throws if we write own exception and write the  exception class name
    public static void ageChecking(int age) throws UserDefinedException{
        if (age <= 18){
            throw new UserDefinedException("age invalid");
        }
    }
}

class UserDefinedException extends Exception{
    String message;
    UserDefinedException(String message){
        this.message = message;
    }
}