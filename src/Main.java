import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        printWelcome();
        while (isRunning){
            printMenu();
            System.out.print("Enter your choice: ");
            if (!sc.hasNextLine()){
                break;
            }
            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    Expedition expedition = new Expedition();
                    //New expedition is ready.
                    //Continued in stage 2
                    break;
                case "2":
                    System.out.println("Exiting Relic Expedition. Goodbye!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }

        sc.close();
    }

    private static void printWelcome() {
        System.out.println("==========================================");
        System.out.println("       WELCOME TO RELIC EXPEDITION        ");
        System.out.println("==========================================");
        System.out.println("Objective: Collect all relics (R) and reach the exit (X)");
        System.out.println("before your energy runs out!");
        System.out.println("\nMap Symbols:");
        System.out.println("  @ : Player (You)        . : Empty space");
        System.out.println("  S : Start               X : Exit");
        System.out.println("  R : Relic (+100 pts)    H : Hazard (-2 extra energy)");
        System.out.println("  C : Supply Cache (+5 energy, once)");
        System.out.println("==========================================");
        // We will only access this method from the main class. It is better to use private instead of public.
    }

    private static void printMenu(){
        System.out.println("1. New Game");
        System.out.println("2. Exit");
    }
}