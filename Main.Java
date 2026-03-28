import java.io.*;
import java.time.LocalDate;
import java.util.*;

// Attendance Record Class
class AttendanceRecord {
    private String rollNo;
    private LocalDate date;
    private boolean isPresent;

    //  Added slot & faculty
    private final String slot = "B14 + D21";
    private final String faculty = "DR. KAMLESH CHANDRAVANSHI";

    public AttendanceRecord(String rollNo, LocalDate date, boolean isPresent) {
        this.rollNo = rollNo;
        this.date = date;
        this.isPresent = isPresent;
    }

    public String getRollNo() { return rollNo; }
    public LocalDate getDate() { return date; }
    public boolean isPresent() { return isPresent; }
    public String getSlot() { return slot; }
    public String getFaculty() { return faculty; }

    @Override
    public String toString() {
        return rollNo + "," + date + "," + isPresent + "," + slot + "," + faculty;
    }
}

// Attendance System Class
class AttendanceSystem {

    private Map<String, AttendanceRecord> records = new HashMap<>();

    // ENROLLED STUDENT LIST
    private Set<String> validStudents = new HashSet<>(Arrays.asList(
        "24BAI10818","24BAI10110","24BAI10890","24BAI10819","24BAI10810",
        "24BCE10899","24BCE67895","24BEY23490","24BAI10812","24BAI19834",
        "23BCE10456","25BHI10245","24BAI25678","24BAI10675","24BCE10643"
    ));

    private String generateKey(String rollNo, LocalDate date) {
        return rollNo + "-" + date.toString();
    }

    public void markAttendance(String rollNo, boolean isPresent) {

        if (!validStudents.contains(rollNo)) {
            System.out.println("❌ Invalid Roll Number!");
            return;
        }

        LocalDate today = LocalDate.now();
        String key = generateKey(rollNo, today);

        if (records.containsKey(key)) {
            System.out.println("❌ Already marked! Cannot modify.");
            return;
        }

        AttendanceRecord record = new AttendanceRecord(rollNo, today, isPresent);
        records.put(key, record);

        System.out.println("✅ Attendance marked.");
    }

    public void viewAttendance(String rollNo) {

        if (!validStudents.contains(rollNo)) {
            System.out.println("❌ Invalid Roll Number!");
            return;
        }

        boolean found = false;

        for (AttendanceRecord record : records.values()) {
            if (record.getRollNo().equals(rollNo)) {
                System.out.println("----------------------------------");
                System.out.println("Date     : " + record.getDate());
                System.out.println("Status   : " + (record.isPresent() ? "Present" : "Absent"));
                System.out.println("Slot     : " + record.getSlot());
                System.out.println("Faculty  : " + record.getFaculty());
                System.out.println("----------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No attendance records found.");
        }
    }

    public void showAllStudents() {
        System.out.println("\n📋 Student List:");
        for (String s : validStudents) {
            System.out.println(s);
        }
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        AttendanceSystem system = new AttendanceSystem();
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println(" ATTENDANCE SYSTEM ");
        System.out.println(" Slot    : B14 + D21");
        System.out.println(" Faculty : DR. KAMLESH CHANDRAVANSHI");
        System.out.println("======================================");

        while (true) {
            System.out.println("\n1. Mark Attendance");
            System.out.println("2. View Attendance");
            System.out.println("3. Show Student List");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    String roll = sc.nextLine();

                    System.out.print("Present? (true/false): ");
                    boolean status = sc.nextBoolean();

                    system.markAttendance(roll, status);
                    break;

                case 2:
                    System.out.print("Enter Roll No: ");
                    String r = sc.nextLine();
                    system.viewAttendance(r);
                    break;

                case 3:
                    system.showAllStudents();
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
