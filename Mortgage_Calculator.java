package JavaPrograms;

import java.text.NumberFormat;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {
        final byte Percent =100;
        final byte Months_yearly = 12;

        Scanner sc = new Scanner(System.in);

        System.out.print("Principal Amount: ");
        int principal = sc.nextInt();

        System.out.print("Annual Interest Rate: ");
        Float interest = sc.nextFloat();
        Float Monthly_interest = interest/Percent/Months_yearly;

        System.out.print("Period(Years): ");
        byte months = sc.nextByte();
        int period = months * Months_yearly;

        double Mortgage = principal * (Monthly_interest*(Math.pow(1 + Monthly_interest,period))) / (Math.pow(1 + Monthly_interest,period)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);

        System.out.println("The Mortagage is " + mortgageFormatted);

    }
}
