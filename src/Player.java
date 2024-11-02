import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        State<Action> currentState = new HoldBallState();

        while (true) {
            if (currentState instanceof InvalidState) {
                break;
            }

            if (currentState instanceof FinalState) {
                System.out.println("Player successfully did his job.");
                break;
            }
            
            System.out.println("Choose action:");
            System.out.println("1. DRIBBLE");
            System.out.println("2. STOP");
            System.out.println("3. TRICK");
            System.out.println("4. LOW_POWER_KICK");
            System.out.println("5. HIGH_POWER_KICK");
            System.out.println("0. exit");

            int choice = scanner.nextInt();
            Action action = null;

            switch (choice) {
                case 1 -> action = Action.DRIBBLE;
                case 2 -> action = Action.STOP;
                case 3 -> action = Action.TRICK;
                case 4 -> action = Action.LOW_POWER_KICK;
                case 5 -> action = Action.HIGH_POWER_KICK;
                case 0 -> {
                    System.out.println("Program closed.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice, try again!");
            }

            if (action != null) {
                currentState = currentState.input(action);
                System.out.println(currentState.getMessage());
            }
        }

        scanner.close();
    }
}
