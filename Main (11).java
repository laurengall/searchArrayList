
// importing ArrayList and Scanner
import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean running = true;
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    System.out.println("Type your first number:");
    int a = input.nextInt();
    list.add(a);
    System.out.println("Would you like to add to the list? Type 1 for yes and 2 for no.");
    int runAgain = input.nextInt();
    if (runAgain == 2) {
      running = false;
    } else {
      running = true;
    }
    while (running) {
      System.out.println("Type your next number: ");
      a = input.nextInt();
      list.add(a);
      System.out.println("Would you like to add to the list? Type 1 for yes and 2 for no.");
      runAgain = input.nextInt();
      if (runAgain == 2) {
        running = false;
        System.out.println("Your current list is: " + list);
        odd(list);
        even(list);
      } else {
        running = true;
      }
    }
  }

  // finds the odd numbers in the list
  public static void odd(ArrayList<Integer> l) {
    ArrayList<Integer> odds = new ArrayList<Integer>();
    for (int i : l) {
      if (i % 2 == 1) {
        odds.add(i);
      }
    }
    int numOdds = odds.size();
    System.out.println("There are " + numOdds + " odd numbers in the array.");
    System.out.print("The odd numbers in the array are: ");
    for (int x : odds) {
      System.out.print(x + " ");
    }
    System.out.println();
  }

  // finds the even numbers in the list
  public static void even(ArrayList<Integer> l) {
    ArrayList<Integer> evens = new ArrayList<Integer>();
    for (int i : l) {
      if (i % 2 == 0) {
        evens.add(i);
      }
    }
    int numEvens = evens.size();
    System.out.println("There are " + numEvens + " even numbers in the array.");
    System.out.print("The even numbers in the array are: ");
    for (int x : evens) {
      System.out.print(x + " ");
    }
    System.out.println();
  }
}