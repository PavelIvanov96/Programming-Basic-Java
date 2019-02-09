import java.util.Scanner;

public class S04_Metric_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String unitInput = scanner.nextLine();
        String unitOutput = scanner.nextLine();

        double inputToMilimeters = 0;
        double result = 0;
        if(unitInput.equals("m")){
            inputToMilimeters = num * 1000;
        } else if (unitInput.equals("cm")){
            inputToMilimeters = num * 10;
        } else if (unitInput.equals("mm")){
            inputToMilimeters = num;
        }

        if (unitOutput.equals("m")){
            result = inputToMilimeters / 1000;
        } else if (unitOutput.equals("cm")){
            result = inputToMilimeters / 10;
        } else if (unitOutput.equals("mm")) {
            result = inputToMilimeters;
        }

        System.out.printf("%.3f", result);
    }

}
