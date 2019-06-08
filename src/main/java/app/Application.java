package app;

import app.information.Passport;
import app.student.RWD;
import app.student.Region;
import app.student.SGE;
import app.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

@SpringBootApplication
public class Application {

    static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        LOG.info("Data initializing...");
        Student student1 = new Student();
        student1.setUuid("1");
        student1.setPassport(new Passport("Иван", "Васильевич", "Петров", "0001", "999000"));
        student1.setRwd(RWD.NoN);
        student1.setSge(new SGE("1929-4212-1231"));
        student1.getSge().setHasMapped(true);
        student1.getSge().setTotalScore(299);
        student1.setRegion(new Region(78 - 1));
        StudentDispatcher.getInstance().addMe(student1);

        Student student2 = new Student();
        student2.setUuid("2");
        student2.setPassport(new Passport("Пётр", "Александрович", "Сидоров", "0001", "999001"));
        student2.setRwd(RWD.NoN);
        student2.setRegion(new Region(78 - 1));
        student2.setSge(new SGE(""));
        student2.getSge().setHasMapped(true);
        student2.getSge().setTotalScore(130);
        StudentDispatcher.getInstance().addMe(student2);

        Student student3 = new Student();
        student3.setUuid("3");
        student3.setPassport(new Passport("Василий", "Антонович", "Иванов", "0001", "999002"));
        student3.setRwd(RWD.NoN);
        student3.setRegion(new Region(78 - 1));
        StudentDispatcher.getInstance().addMe(student3);

        LOG.info("Complete");
    }

}
