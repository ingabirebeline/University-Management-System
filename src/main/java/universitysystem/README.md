# University Student Management System

A simple Java console program that manages students, courses and enrollments.
Data is saved in a PostgreSQL database.

## How to run

1. In pgAdmin, create a database named `University`.
2. Run `schema.sql` in its Query Tool to create the tables.
3. In `DBConnection.java`, put your PostgreSQL password.
4. Run `Main.java` in IntelliJ.

## Menu

1. Add student
2. List students
3. Remove student
4. Add course
5. List courses
6. Remove course
7. Enroll student in course
8. Show students with their courses
9. Exit

## Project parts

- **OOP classes:** Person, Student, Instructor, Course
- **DAO classes:** StudentDAO, CourseDAO, EnrollmentDAO (they talk to the database)
- **Main:** the menu