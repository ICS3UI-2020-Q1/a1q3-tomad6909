import java.util.Scanner;
/**
 * This program prompts the user how many of each item they want to purchase
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for the user
    Scanner input = new Scanner(System.in);

    // ask user for how many chromebook chargers they want
    System.out.println("How many chromebook chargers do you want?");

    int chromebook = input.nextInt();

    System.out.println("How many motherboards do you want?");

    int motherboard = input.nextInt();

    System.out.println("How many mice do you want?");

    int mice = input.nextInt();

    double totalChromebook = chromebook * 34.99;
    double totalMotherboard = motherboard * 127.50;
    double totalMice = mice * 18.00;

    double subtotal = totalChromebook + totalMotherboard + totalMice;

    System.out.println("The subtotal is $" + subtotal);

    double tax = subtotal * 0.13;

    System.out.println("The tax is $" + tax);

    double total = subtotal + tax;

    System.out.println("The total is $" + total);
  }
}
