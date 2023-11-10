import java.util.Scanner;
public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line, row;
        String name, next;

        String[][] watcher = new String[4][2];

        while (true) {
            System.out.print("Input Your Name: ");
            name = sc.nextLine();

            System.out.print("Input Your Line: ");
            line = sc.nextInt();

            System.out.print("Input Your Row: ");
            row = sc.nextInt();
            sc.nextLine();

            watcher[line-1][row-1] = name;

            System.out.print("Input other Attendee? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

    }
}
