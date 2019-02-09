import java.util.Scanner;

public class S09_Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minimalSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = Math.floor(minimalSalary * 0.35);
        double excellentScholarship = Math.floor(averageGrade * 25);

        if (averageGrade >= 5.5 & income < minimalSalary & socialScholarship >= excellentScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (averageGrade >= 5.5 & income < minimalSalary & socialScholarship < excellentScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        } else if (averageGrade > 4.5 & income < minimalSalary) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (averageGrade >= 5.5) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        } else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
