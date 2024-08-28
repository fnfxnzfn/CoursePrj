/*
 *@ (#) TestCourse.java     1.0    28/08/2024
 *
 *  Copyright (c) 2024 IUH.All rights reserved.All rights reserved.
 */
package edu.iuh.fit;
import java.util.Scanner;
/*
 *@description:
 *@author: Tran Duc Nam
 *@date: 28/08/2024
 *@version: 1.0
 */
public class TestCourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseList courseList = new CourseList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. Find Course by ID");
            System.out.println("4. Print All Courses");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Course ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Course Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Course Credit: ");
                    int credit = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Course Department: ");
                    String department = scanner.nextLine();
                    Course course = new Course(id,title,String.valueOf(credit),department);
                    courseList.addCourse(course);
                    break;
                case 2:
                    System.out.print("Enter Course ID to remove: ");
                    String removeId = scanner.nextLine();
                    if (courseList.removeCourse(removeId)) {
                        System.out.println("Course removed successfully.");
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Course ID to find: ");
                    String findId = scanner.nextLine();
                    Course foundCourse = courseList.findCourseById(findId);
                    if (foundCourse != null) {
                        System.out.println("Course found: " + foundCourse);
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 4:
                    courseList.printCourses();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
