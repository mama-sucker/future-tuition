// Module 5 Excercise 5.7 
// By Addison Roy 

// Imports 
import java.util.Scanner;

public class FutureTuition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Future tuition calculator 5% increase on every year\nup to 10 years\n");
        System.out.print("Enter the starting tuition cost: $");
        double startingTuition = scanner.nextDouble();
        
        double tuition = startingTuition;
        final double INCREASE_RATE = 0.05;
        
        System.out.println("Year\tTuition");
        System.out.println("---------------------");
        
        for (int year = 1; year <= 10; year++) {
            tuition += tuition * INCREASE_RATE;
            System.out.printf("%d\t$%.2f%n", year, tuition);
        }
        
        scanner.close();
        System.out.println("Congrats you got scammed!");
    }
}

