package app.university;

public class Course {

    private int minScore;
    private int totalCapacityFullTime;
    private int budgetCapacityFullTime;
    private int totalCapacityExternal;
    private int budgetCapacityExternal;
    private int dormitoryCapacity;

    public int getTotalCapacityFullTime() {
        return totalCapacityFullTime;
    }

    public void setTotalCapacityFullTime(int totalCapacityFullTime) {
        this.totalCapacityFullTime = totalCapacityFullTime;
    }

    public int getBudgetCapacityFullTime() {
        return budgetCapacityFullTime;
    }

    public void setBudgetCapacityFullTime(int budgetCapacityFullTime) {
        this.budgetCapacityFullTime = budgetCapacityFullTime;
    }

    public int getTotalCapacityExternal() {
        return totalCapacityExternal;
    }

    public void setTotalCapacityExternal(int totalCapacityExternal) {
        this.totalCapacityExternal = totalCapacityExternal;
    }

    public int getBudgetCapacityExternal() {
        return budgetCapacityExternal;
    }

    public void setBudgetCapacityExternal(int budgetCapacityExternal) {
        this.budgetCapacityExternal = budgetCapacityExternal;
    }

    public int getDormitoryCapacity() {
        return dormitoryCapacity;
    }

    public void setDormitoryCapacity(int dormitoryCapacity) {
        this.dormitoryCapacity = dormitoryCapacity;
    }

    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        this.minScore = minScore;
    }
}
