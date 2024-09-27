import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TipCalculator tipcalculator = new TipCalculator();
        Scanner s = new Scanner(System.in);

        tipcalculator.greeting();
        
        System.out.print("What is your total bill?: ");
        String bill = s.nextLine();
        double totalBill = Double.parseDouble(bill);
        System.out.print("What is your tip percentage?: ");
        String percentage = s.nextLine();
        double tipPercentage = Double.parseDouble(percentage);
        System.out.print("How many people are taking the bill?: ");
        String people = s.nextLine();
        int numberOfPeople = Integer.parseInt(people);
        System.out.println("----------------------------------------------");

        TipCalculator tipCalculator2 = new TipCalculator(totalBill, tipPercentage, numberOfPeople);
        tipCalculator2.output();

    }
}