public void viewAttendance(String rollNo) {

    boolean found = false;

    for (AttendanceRecord record : records.values()) {
        if (record.getRollNo().equals(rollNo)) {
            System.out.println("Date: " + record.getDate());
            System.out.println("Status: " + (record.isPresent() ? "Present" : "Absent"));
            found = true;
        }
    }

    if (!found) {
        System.out.println("No records found.");
    }
}
