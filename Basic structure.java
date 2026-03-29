import java.time.LocalDate;
import java.util.*;

// Attendance Record Class
class AttendanceRecord {
    private String rollNo;
    private LocalDate date;
    private boolean isPresent;

    public AttendanceRecord(String rollNo, LocalDate date, boolean isPresent) {
        this.rollNo = rollNo;
        this.date = date;
        this.isPresent = isPresent;
    }

    public String getRollNo() { return rollNo; }
    public LocalDate getDate() { return date; }
    public boolean isPresent() { return isPresent; }
}

// Attendance System Class
class AttendanceSystem {
    private Map<String, AttendanceRecord> records = new HashMap<>();
}

// Main Class
public class Main {
    public static void main(String[] args) {
        System.out.println("Attendance System Started");
    }
}
