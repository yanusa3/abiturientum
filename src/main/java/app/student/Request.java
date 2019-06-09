package app.student;

public class Request {
    private String uuid;
    private String studentId;
    private String universityId;
    private Status status = Status.CREATED;

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getStudentId() {
        return studentId;
    }
}
