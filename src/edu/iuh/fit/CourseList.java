/*
 *@ (#) CourseList.java     1.0    28/08/2024
 *
 *  Copyright (c) 2024 IUH.All rights reserved.All rights reserved.
 */
package edu.iuh.fit;
import java.util.ArrayList;
import java.util.List;
/*
 *@description:
 *@author: Tran Duc Nam
 *@date: 28/08/2024
 *@version: 1.0
 */
import java.util.ArrayList;
import java.util.List;
public class CourseList {
    private List<Course> courses;

    public CourseList() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public boolean removeCourse(String id) {
        return courses.removeIf(course -> course.getId().equals(id));
    }

    public Course findCourseById(String id) {
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                return course;
            }
        }
        return null;
    }

    public void printCourses() {
        System.out.printf("%-10s %-20s %-10s %-20s%n", "ID", "Title", "Credit", "Department");
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
