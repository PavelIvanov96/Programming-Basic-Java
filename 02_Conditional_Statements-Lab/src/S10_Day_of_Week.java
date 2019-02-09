import java.util.Scanner;

public class S10_Day_of_Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfWeek = Integer.parseInt(scanner.nextLine());
        String numToWord = "";

        if (numOfWeek == 1){
            numToWord = "Monday";
        }else if (numOfWeek == 2){
            numToWord = "Tuesday";
        }else if (numOfWeek == 3){
            numToWord = "Wednesday";
        }else if (numOfWeek == 4){
            numToWord = "Thursday";
        }else if (numOfWeek == 5){
            numToWord = "Friday";
        }else if (numOfWeek == 6){
            numToWord = "Saturday";
        }else if (numOfWeek == 7){
            numToWord = "Sunday";
        }
        else{
            System.out.println("Error");
            return;
        }
        System.out.println(numToWord);
    }
}
