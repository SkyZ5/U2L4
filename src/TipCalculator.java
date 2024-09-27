public class TipCalculator {

    private double tipPerPerson;
    private double totalPerPerson;
    String totalTipAmountConverted;
    String totalBillWithTipConverted;
    String tipPerPersonConverted;
    String totalPerPersonConverted;


    public TipCalculator() {
    }
    public TipCalculator(double totalBill, double tipPercentage, int numberOfPeople) {
        tipPercentage /= 100;
        double totalTipAmount = totalBill * tipPercentage;
        double totalBillWithTip = totalBill + totalTipAmount;
        tipPerPerson = totalTipAmount / numberOfPeople;
        totalPerPerson = totalBillWithTip / numberOfPeople;
        totalTipAmountConverted = convert(totalTipAmount);
        totalBillWithTipConverted = convert(totalBillWithTip);
        tipPerPersonConverted = convert(tipPerPerson);
        totalPerPersonConverted = convert(totalPerPerson);
    }
    public void greeting() {
        System.out.println("----------------------------------------------");
        System.out.println("This program only accepts numbers (No symbols)");
        System.out.println("----------------------------------------------");
    }
    
    public String convert(double value) { 
        double rounded = Math.round(value * 100.0) / 100.0;
        return String.format("%.2f", rounded);
    }

    public void output() {
        System.out.println("Total amount tipped: $" + totalTipAmountConverted);
        System.out.println("Total bill including tip: $" + totalBillWithTipConverted);
        System.out.println("Tip per person: $" + tipPerPersonConverted);
        System.out.println("Total per Person: $" + totalPerPersonConverted);
        System.out.println("----------------------------------------------");
    }
}
