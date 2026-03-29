import java.time.LocalDate;

public class AttendanceRecord {
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
