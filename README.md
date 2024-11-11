# School Management System - Java

## Overview

The **School Management System** is a Java-based command-line application designed to manage the administrative tasks of a school. This system allows administrators to manage student, teacher, and course records, as well as perform student enrollments, teacher assignments to courses, and grade management. The application is designed with simplicity and scalability in mind, using Object-Oriented Programming (OOP) principles.

### Key Features
- **Student Management**: Add, update, delete, and view student records (name, roll number, contact, etc.).
- **Teacher Management**: Add, update, delete, and view teacher details (name, department, contact, etc.).
- **Course Management**: Add, update, delete, and view courses (course name, code, description, etc.).
- **Student Enrollment**: Enroll students in courses and view enrollment details.
- **Grade Management**: Assign and view grades for students in their respective courses.
- **Command Line Interface (CLI)**: Simple CLI interface to interact with the system.

## Technologies Used

- **Java 8+**
- **Object-Oriented Programming (OOP) Concepts**
- **File Handling** (to store records persistently)
- **CLI for user interaction**

## Prerequisites

To run the School Management System project, you need:
- **Java Development Kit (JDK) version 8 or higher**.
- A **text editor** or **IDE** like IntelliJ IDEA, Eclipse, or Visual Studio Code.



### Example Commands:

1. **Add Student**:
    - Name: John Doe
    - Roll Number: 101
    - Contact: johndoe@example.com
2. **Enroll Student in Course**:
    - Roll Number: 101
    - Course Name: Java Programming
3. **View All Students**: List all students with details.

## Example Code

Here’s a brief example of the **Student** class, which stores student details and allows students to enroll in courses.

```java
public class Student {
    private String name;
    private int rollNumber;
    private String contact;
    private List<String> enrolledCourses;

    // Constructor
    public Student(String name, int rollNumber, String contact) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.contact = contact;
        this.enrolledCourses = new ArrayList<>();
    }

    // Method to enroll student in a course
    public void enrollInCourse(String course) {
        enrolledCourses.add(course);
    }

    // Method to display enrolled courses
    public void viewCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (String course : enrolledCourses) {
            System.out.println(course);
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getContact() {
        return contact;
    }
}
