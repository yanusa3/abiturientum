package app.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static app.StudentDispatcher.getInstance;

@RestController
public class StudentController {

    @RequestMapping("/me")
    public Student me(@RequestParam(value="uuid") String uuid) {
        return getInstance().getMe(uuid);
    }

    @PostMapping("/me")
    public void putMe(@RequestBody Student student) {
        getInstance().addMe(student);
    }

    @RequestMapping("/requests")
    public List<Request> requests(@RequestParam(value="uuid") String uuid) {
        return getInstance().getRequests(uuid);
    }

}
