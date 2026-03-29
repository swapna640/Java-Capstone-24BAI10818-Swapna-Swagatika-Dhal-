import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AttendanceSystem system = new AttendanceSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Mark\n2. View\n3. Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Roll: ");
                    String roll = sc.next();
                    System.out.print("Present (true/false): ");
                    boolean status = sc.nextBoolean();
                    system.markAttendance(roll, status);
                    break;

                case 2:
                    System.out.print("Roll: ");
                    system.viewAttendance(sc.next());
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}
