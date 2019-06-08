package app;

import app.student.Request;
import app.student.Student;
import java.util.HashMap;

public class StudentDispatcher {

    private static StudentDispatcher dispatcher;
    private HashMap<String, Student> students;
    private HashMap<Student, Request> requests;

    public static synchronized StudentDispatcher getInstance(){
        if (dispatcher == null) {
            dispatcher = new StudentDispatcher();
        }
        return dispatcher;
    }

    private StudentDispatcher(){
        students = new HashMap<>();
    }

    public Student getMe(String uuid){
        if (!students.containsKey(uuid)){
            return null;
        }
        return students.get(uuid);
    }

    public void addMe(Student student){
        students.put(student.getUuid(), student);
    }
}
