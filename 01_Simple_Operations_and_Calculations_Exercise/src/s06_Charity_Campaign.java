import java.util.Scanner;

public class s06_Charity_Campaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int bakers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int puncakes = Integer.parseInt(scanner.nextLine());

        double incomeCakes = cakes * 45;
        double incomeWaffles = waffles * 5.80;
        double incomePuncakes = puncakes * 3.20;

        double incomeForOneDay = (incomeCakes + incomePuncakes + incomeWaffles) * bakers;

        double incomeForAllDays = incomeForOneDay * days;
        double afterReckoning =incomeForAllDays - (incomeForAllDays / 8);

        System.out.printf("%.2f", afterReckoning);
    }
}
