import java.util.Scanner;

public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner kn = new Scanner(System.in);
        int line, row, menuChoice;
        String name, reChoice, occupiedS;
        boolean list = false, menuData = false;

        String[][] audience = new String[4][2];

        while (!menuData) {
            System.out.println("Menu list: ");
            System.out.println("1.Input your data");
            System.out.println("2.Display audience list");
            System.out.println("3.Exit");

            System.out.print("Please choose the number option: ");
            menuChoice = kn.nextInt();

            if (menuChoice == 1) {
                while (true) {
                    System.out.print("Enter your name: ");
                    name = kn.next();

                    System.out.print("Enter your seat line: ");
                    line = kn.nextInt();

                    System.out.print("Enter your seat row: ");
                    row = kn.nextInt();
                    kn.nextLine();
                    if (audience[line - 1][row - 1] == null) {
                        audience[line - 1][row - 1] = name;
                        System.out.println("Your name has been recorded.");
                    } else {
                        System.out.println("This seat has been booked");
                        name = audience[line - 1][row - 1];
                        System.out.println("Would you choose another seat? (y/n):");
                        occupiedS = kn.next();
                        if (occupiedS.equalsIgnoreCase("n")){
                            break;
                        }
                    }

                    System.out.println("Enter another person/audience ? (y/n): ");
                    reChoice = kn.nextLine();

                    if (reChoice.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menuChoice == 2) {
                for (int i = 0; i < audience.length; i++) {
                    for (int j = 0; j < audience[i].length;j++) {
                        if (audience[i][j] == null) {
                            String stars = "***";
                            audience[i][j] = stars; } }
                    System.out.println(String.join("  ", audience[i]));
                }
            } else {
                menuData = true;
            }
        }
    }
}