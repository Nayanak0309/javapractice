class InvalidLoginException extends Exception {
    public InvalidLoginException(String msg) {
        super(msg);
    }
}

public class Login {
    public static void main(String[] args) {
        String username = "admin";
        String password = "1234";
        try {
            if (!username.equals("admin") || !password.equals("admin123")) {
                throw new InvalidLoginException("Invalid Username or Password");
            }
            System.out.println("Login Successful");
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }
    }
}