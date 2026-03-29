class AttendanceSystem {

    private Map<String, AttendanceRecord> records = new HashMap<>();

    private Set<String> validStudents = new HashSet<>(Arrays.asList(
        "24BAI10818","24BAI10110","24BAI10890"
    ));

    private String generateKey(String rollNo, LocalDate date) {
        return rollNo + "-" + date.toString();
    }

    public void markAttendance(String rollNo, boolean isPresent) {

        if (!validStudents.contains(rollNo)) {
            System.out.println("Invalid Roll Number!");
            return;
        }

        LocalDate today = LocalDate.now();
        String key = generateKey(rollNo, today);

        AttendanceRecord record = new AttendanceRecord(rollNo, today, isPresent);
        records.put(key, record);

        System.out.println("Attendance marked.");
    }
}
