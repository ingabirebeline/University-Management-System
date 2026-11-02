package universitysystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();

        int choice = -1;

        while (choice != 0) {
            System.out.println();
            System.out.println("1. Add student");
            System.out.println("2. List students");
            System.out.println("3. Remove student");
            System.out.println("4. Add course");
            System.out.println("5. List courses");
            System.out.println("6. Remove course");
            System.out.println("7. Enroll student in course");
            System.out.println("8. Show students with their courses");
            System.out.println("9. Change enrollment course");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        studentDAO.addStudent(name, email);
                        System.out.println("Student added.");
                        break;
                    case 2:
                        studentDAO.listStudents();
                        break;
                    case 3:
                        System.out.print("Student id: ");
                        studentDAO.deleteStudent(Integer.parseInt(sc.nextLine()));
                        System.out.println("Student removed.");
                        break;
                    case 4:
                        System.out.print("Course title: ");
                        courseDAO.addCourse(sc.nextLine());
                        System.out.println("Course added.");
                        break;
                    case 5:
                        courseDAO.listCourses();
                        break;
                    case 6:
                        System.out.print("Course id: ");
                        courseDAO.deleteCourse(Integer.parseInt(sc.nextLine()));
                        System.out.println("Course removed.");
                        break;
                    case 7:
                        System.out.print("Student id: ");
                        int studentId = Integer.parseInt(sc.nextLine());
                        System.out.print("Course id: ");
                        int courseId = Integer.parseInt(sc.nextLine());
                        enrollmentDAO.enroll(studentId, courseId);
                        System.out.println("Enrolled.");
                        break;


                    case 8:
                        enrollmentDAO.showStudentsWithCourses();
                        break;

                    case 9: {
                        System.out.print("Enrollment id: ");
                        int enrollmentId = Integer.parseInt(sc.nextLine());

                        System.out.print("New course id: ");
                        int newCourseId = Integer.parseInt(sc.nextLine());

                        enrollmentDAO.changeCourse(enrollmentId, newCourseId);
                        System.out.println("Enrollment updated.");
                        break;
                    }
                    case 0:
                        System.out.println("Goodbye!");
                        break;

                    default:
                        System.out.println("Choose a number from 0 to 9.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Please type a number.");
            } catch (Exception e) {
                System.out.println("Database error: " + e.getMessage());

            }
        }
    }}