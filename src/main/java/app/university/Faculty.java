package app.university;

import java.util.List;

public class Faculty {

    private List<Course> courseList;
    private int totalCapacityFullTime;
    private int budgetCapacityFullTime;
    private int totalCapacityExternal;
    private int budgetCapacityExternal;
    private int dormitoryCapacity;

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public int getTotalCapacityFullTime() {
        totalCapacityFullTime = 0;
        if(courseList == null || courseList.isEmpty()) return totalCapacityFullTime;
        for (Course course : courseList) {
            totalCapacityFullTime += course.getTotalCapacityFullTime();
        }
        return totalCapacityFullTime;
    }

    public int getBudgetCapacityFullTime() {
        budgetCapacityFullTime = 0;
        if(courseList == null || courseList.isEmpty()) return budgetCapacityFullTime;
        for (Course course : courseList) {
            budgetCapacityFullTime += course.getBudgetCapacityFullTime();
        }
        return budgetCapacityFullTime;
    }

    public int getTotalCapacityExternal() {
        totalCapacityExternal = 0;
        if(courseList == null || courseList.isEmpty()) return totalCapacityExternal;
        for (Course course : courseList) {
            totalCapacityExternal += course.getTotalCapacityExternal();
        }
        return totalCapacityExternal;
    }

    public int getBudgetCapacityExternal() {
        budgetCapacityExternal = 0;
        if(courseList == null || courseList.isEmpty()) return budgetCapacityExternal;
        for (Course course : courseList) {
            budgetCapacityExternal += course.getBudgetCapacityExternal();
        }
        return budgetCapacityExternal;
    }

    public int getDormitoryCapacity() {
        dormitoryCapacity = 0;
        if(courseList == null || courseList.isEmpty()) return dormitoryCapacity;
        for (Course course : courseList) {
            dormitoryCapacity += course.getDormitoryCapacity();
        }
        return dormitoryCapacity;
    }
}
