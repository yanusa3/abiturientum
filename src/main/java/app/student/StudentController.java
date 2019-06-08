package app.student;

import org.springframework.web.bind.annotation.*;

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

}
