import CourseMan.Enrolment;
import CourseMan.Modules;
import CourseMan.Student;
import CourseMan.StudentSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EnrolmentManager{
public static List<Enrolment> enrolmentList= new ArrayList<>();
public void addEnrollment(Enrolment enrolment){
    enrolmentList.add(enrolment);
}

    public Enrolment getEnrolment(Student student, Modules module) {
        return enrolmentList.stream().filter(obj -> obj.getModule().equals(module) && obj.getStudent().equals(student)).collect(Collectors.toList()).get(0);
    }
    public void setMarks(Student student, Modules module, float internal, float examination) {
        Enrolment enrolment = getEnrolment(student, module);
        if (enrolment != null) {
            enrolment.internalMark = internal;
            enrolment.examinationMark = examination;
        }
    }

    public String report() {
        enrolmentList.forEach(it->{
            System.out.println(it.toString());
        });
        return "";
    }
    public String reportAssessment() {
        enrolmentList.forEach(it -> {
            System.out.println(it.toString(""));
        });
        return "";
    }
    public void sort() {
        Collections.sort(enrolmentList,new StudentSort().reversed());
    }
}
