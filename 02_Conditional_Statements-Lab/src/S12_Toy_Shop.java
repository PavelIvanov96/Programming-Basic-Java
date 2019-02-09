import java.util.Scanner;

public class S12_Toy_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeededForExcursion = Double.parseDouble(scanner.nextLine());
        double puzzle = Double.parseDouble(scanner.nextLine());
        double doll = Double.parseDouble(scanner.nextLine());
        double teddyBear = Double.parseDouble(scanner.nextLine());
        double minion = Double.parseDouble(scanner.nextLine());
        double track = Double.parseDouble(scanner.nextLine());


        double sum = puzzle * 2.60 + doll * 3 + teddyBear * 4.10 + minion * 8.20 + track * 2;
        double numberOfToys = puzzle + doll + teddyBear + minion + track;

        if (numberOfToys >= 50) {
            sum = sum * 0.75;
        }
        double finalProfit = sum * 0.90;

        if (finalProfit >= moneyNeededForExcursion) {
            double result = finalProfit - moneyNeededForExcursion;
            System.out.printf("Yes! %.2f lv left.", result);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeededForExcursion - finalProfit);
        }
    }
}
