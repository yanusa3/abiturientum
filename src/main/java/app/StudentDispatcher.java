package app;

import app.student.Request;
import app.student.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentDispatcher {

    private static StudentDispatcher dispatcher;
    private HashMap<String, Student> students;
    private HashMap<String, List<Request>> requests;

    public static synchronized StudentDispatcher getInstance(){
        if (dispatcher == null) {
            dispatcher = new StudentDispatcher();
        }
        return dispatcher;
    }

    private StudentDispatcher(){
        students = new HashMap<>();
        requests = new HashMap<>();
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

    public List<Request> getRequests(String uuid){
        if (!requests.containsKey(uuid)){
            return null;
        }
        return requests.get(uuid);
    }

    public void addRequests(Request request){
        if (!requests.containsKey(request.getUuid())){
            requests.put(request.getStudentId(), new ArrayList<>());
        }
        requests.get(request.getStudentId()).add(request);
    }

}
