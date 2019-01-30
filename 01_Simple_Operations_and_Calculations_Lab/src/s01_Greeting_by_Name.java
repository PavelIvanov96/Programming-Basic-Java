import java.util.Scanner;

public class s01_Greeting_by_Name {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String name = scaner.nextLine();

        System.out.printf("Hello, %s!", name);
    }
}
