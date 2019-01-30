import java.util.Scanner;

public class s07_Alcohol_Market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        double beer = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double rakia = Double.parseDouble(scanner.nextLine());
        double wisky = Double.parseDouble(scanner.nextLine());

        double rakiaPricePerLiter = price / 2;
        double winePricePerLiter = rakiaPricePerLiter - (0.4 * rakiaPricePerLiter);
        double beerPricePerLiter = rakiaPricePerLiter - (0.8 * rakiaPricePerLiter);

        double rakiaPrice = rakia * rakiaPricePerLiter;
        double beerPrice = beer * beerPricePerLiter;
        double winePrice = wine * winePricePerLiter;
        double wiskyPrice = wisky * price;

        double neededMoney = rakiaPrice + beerPrice + winePrice + wiskyPrice;

        System.out.printf("%.2f", neededMoney);

    }
}
