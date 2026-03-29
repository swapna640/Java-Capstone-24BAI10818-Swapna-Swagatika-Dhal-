import java.time.LocalDate;
import java.util.*;

public class AttendanceSystem {

    private Map<String, List<AttendanceRecord>> records = new HashMap<>();

    private Set<String> validStudents = new HashSet<>(Arrays.asList(
        "24BAI10818","24BAI10110","24BAI10890","24BAI10819","24BAI10810"
    ));

    public void markAttendance(String rollNo, boolean isPresent) {

        if (!validStudents.contains(rollNo)) {
            System.out.println("Invalid Roll Number!");
            return;
        }

        AttendanceRecord record = new AttendanceRecord(rollNo, LocalDate.now(), isPresent);

        records.putIfAbsent(rollNo, new ArrayList<>());
        records.get(rollNo).add(record);

        System.out.println("Attendance Marked!");
    }

    public void viewAttendance(String rollNo) {

        if (!records.containsKey(rollNo)) {
            System.out.println("No Records Found!");
            return;
        }

        for (AttendanceRecord r : records.get(rollNo)) {
            System.out.println(r.getDate() + " -> " + (r.isPresent() ? "Present" : "Absent"));
        }
    }
}
