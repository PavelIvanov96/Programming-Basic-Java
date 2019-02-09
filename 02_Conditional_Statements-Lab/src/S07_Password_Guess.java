import java.util.Scanner;

public class S07_Password_Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passwod = scanner.nextLine();
        String currencePass = "s3cr3t!P@ssw0rd";

        if (passwod.equals(currencePass)) {
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }
    }
}
