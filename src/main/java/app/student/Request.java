package app.student;

public class Request {
    private int uuid;
    private int studentId;
    private int universityId;
    private Status status;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
