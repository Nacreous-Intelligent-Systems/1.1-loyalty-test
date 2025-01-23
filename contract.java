import java.util.Scanner;

public class contract {
  public static void main (String[] args) throws InterruptedException {

    Scanner scan = new Scanner(System.in);
    String name;

    // Assignment 1.1: Loyalty Test

    boolean eula = false;
    boolean isTemp = false;

    // Code above is HIDDEN

    eula = false;
    
    // Code below is HIDDEN

    System.out.printf("\nWelcome to the Nacreous Intelligent Systems Hiring Center.\n");
    Thread.sleep(1000);
    System.out.printf("\nDo you accept the license agreement? (y/n) ");
    String acc = scan.next();
    Thread.sleep(250);
    System.out.printf("\nProcessing");
      for (int i = 0; i < 3; i++) {
        Thread.sleep(1250);
        System.out.printf(".");
      }
      Thread.sleep(1500);
      System.out.printf("\n");


    if (eula == false && isTemp == false) {
      System.out.printf("Error: License not accepted. Please open contract.java to accept the license agreement, then restart the program.");
    }
    else if (eula == true && isTemp == true) {
      System.out.printf("Error: License mismatch. User has agreed to one (1) or more conflicting licenses.");
    }
    else if (eula == true && !acc.toLowerCase().equals("y")) {
      System.out.printf("Hired! (TODO: Replace with more)");
    }
    

    scan.close();
  }
}
