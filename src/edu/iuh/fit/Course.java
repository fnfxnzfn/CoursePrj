/*
 *@ (#) Course.java     1.0    28/08/2024
 *
 *  Copyright (c) 2024 IUH.All rights reserved.All rights reserved.
 */
package edu.iuh.fit;

/*
 *@description:
 *@author: Tran Duc Nam
 *@date: 28/08/2024
 *@version: 1.0
 */
public class Course {
    private String id;
    private String title;
    private String credit;
    private String department;

    public Course(String id, String title, String credit, String department) {
        this.id = id;
        this.title = title;
        this.credit = credit;
        this.department = department;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return String.format("%-10s %-20s %-10s %-20s", id, title, credit, department);
    }
}
