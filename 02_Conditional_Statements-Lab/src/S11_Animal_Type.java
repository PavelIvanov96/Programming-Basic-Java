import java.util.Scanner;

public class S11_Animal_Type {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.nextLine();

        if (animal.equals("dog")){
            System.out.println("mammal");
        } else if (animal.matches("crocodile|tortoise|snake|")){
            System.out.println("reptile");
        } else{
            System.out.println("unknown");
        }
    }
}
