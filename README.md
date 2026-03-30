Java-Capstone-24BAI10818-Swapna-Swagatika-Dhal-

ATTENDANCE MANAGEMENT SYSTEM (Java) :

Project Title : 
 Console-Based Attendance Management System using Java**



ACADEMIC DETAILS :

Faculty Name: Dr. Kamlesh Chandravanshi
Class Slot: B14 + D21
Course Context: Object-Oriented Programming / Java Programming

PROJECT FILE DEVELOPMENT STEP BY STEP:
Basic Structure.java
ViewAttendance.java
MarkAttendance.java
NoDuplicateEntry.java
Main.java (The whole developed code)
Readme



ABSTRACT :

This project is a "console-based Attendance Management System" developed using "Core Java". It is designed to simulate a real-world classroom attendance tracking mechanism for a small group of students.

The system ensures "data integrity" by preventing duplicate attendance entries for the same student on the same day. It also validates student identity using a predefined list of enrolled roll numbers.

The application demonstrates the practical use of **Object-Oriented Programming (OOP)** principles and "Java Collections Framework", making it an ideal academic project for understanding backend logic and system design fundamentals.

OBJECTIVES :

The primary objectives of this project are:

To design and implement a "real-time attendance tracking system"
To apply "OOP concepts" such as encapsulation and modular design
To utilize "efficient data structures" like HashMap and HashSet
To ensure "tamper-proof attendance marking"
To simulate a "controlled academic environment"

KEY FEATURES :

1. Predefined Student Enrollment :-

The system contains a fixed set of enrolled student roll numbers
Only valid students are allowed to mark attendance
Prevents unauthorized or incorrect data entry


2. Real-Time Attendance Marking :-

Attendance is recorded using the current system date (`LocalDate`)
Users can mark:

  Present (true)
  Absent (false)


3. Duplicate Entry Prevention (Tamper Resistance) :-

Each attendance entry is uniquely identified using:

  Roll Number + Date
  Once attendance is marked, it "cannot be modified or overwritten"



4. Attendacnce Viewing System :-

 Users can view attendance records of any valid student
 Output includes:

   Date
   Attendance Status
   Class Slot
   Faculty Name

5. Student List Display :-

 Displays all enrolled students in the system
 Helps users verify valid roll numbers before marking attendance

6. System Architecture:-

The application follows a "modular class-based design":

1. 'AttendanceRecord' Class

 Represents a single attendance entry
 Attributes:

   Roll Number
   Date
   Attendance Status
   Slot (B14 + D21)
   Faculty Name

2. 'AttendanceSystem' Class

 Core logic handler of the system
 Responsibilities:

   Managing attendance records
   Validating student roll numbers
   Preventing duplicate entries
   Displaying data

3. 'Main' Class

 Entry point of the program
 Handles:

   User interaction
   Menu-driven execution

---

 Data Structures Used

| Data Structure                      | Purpose                                     |
| ----------------------------------- | ------------------------------------------- |
| 'HashMap<String, AttendanceRecord>' | Stores attendance records using unique keys |
| 'HashSet<String>'                   | Stores valid student roll numbers           |
| 'LocalDate'                         | Handles date-based attendance tracking      |

---

Working Principle

1. User selects an operation (mark/view attendance)
2. System validates roll number
3. Generates unique key:
   rollNo + currentDate
4. Checks if record already exists:

    If YES → Reject (no modification allowed)
    If NO → Store attendance
5. Displays structured output



Project Structure

attendance-system
  Main.java
  README.md

Execution Guide

Method 1: Online Compiler

1. Open any online Java compiler (e.g., OnlineGDB)
2. Copy the entire code into the editor
3. Click "Run"
4. Provide input through console


Method 2: Local System

Step 1: Compile
javac Main.java

Step 2: Run
java Main

LIMITATIONS :

 Data is stored **only in memory** (not persistent)
 No graphical interface (CLI-based system)
 Not scalable for large institutions
 No authentication or role management

FUTURE SCOPE AND ENHANCEMENTS :

This project can be extended into a full-scale system by adding:

Attendance percentage calculation
File or database storage (MySQL)
Web-based application (Spring Boot)
Login system for faculty/admin
GUI using Java Swing / JavaFX
Biometric or QR-based attendance

CONCLUSION :

In traditional classroom environments, attendance management often faces practical challenges such as "proxy attendance", where students mark attendance on behalf of others, and "post-class disputes", where students claim they were present despite being marked absent. These issues reduce the reliability and integrity of the attendance system.

This project was developed to address these real-world problems by introducing a "controlled and tamper-resistant attendance mechanism". The system ensures that:
 
 Attendance is marked "in real-time by the faculty" in the presence of students
 Each entry is recorded with respect to the "current date", ensuring proper tracking
 Once attendance is marked, it "cannot be modified or overwritten", eliminating disputes
 Only "pre-enrolled students" are allowed in the system, preventing unauthorized or proxy entries

By enforcing these constraints, the system significantly improves the "accuracy, transparency, and reliability" of attendance management.

Overall, this project demonstrates how a simple Java-based solution can effectively solve common academic issues while reinforcing important programming concepts such as "data integrity, validation, and structured system design".

