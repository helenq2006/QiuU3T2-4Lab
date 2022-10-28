import java.util.Scanner;
 class Main {

public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();

        // write your code here to print the appropriate message(s)
        // described below

        System.out.println("Enter a positive integer: ");
        int userInput = myScanner.nextInt();

        if (userInput <= 0) {
        System.out.println("That isn't positive!");
        } else {
        if (userInput % 5 == 0) {
        System.out.println("Divisible by 5!");
        }
        if (userInput % 7 == 0) {
        System.out.println("Divisible by 7!");
        }
        if (userInput % 5 != 0 && userInput % 7 != 0) {
        System.out.println("Not divisible by 5 or 7!");
        } else {
        if (userInput > 1000) {
        System.out.println("Big even number!");
        } else if (userInput > 100) {
        System.out.println("Medium even number!");
        } else {
        System.out.println("Small even number!");
        }
        }
        }
        }

        }



