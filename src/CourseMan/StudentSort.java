package CourseMan;

import CourseMan.Enrolment;

import java.util.Comparator;

public class StudentSort implements Comparator<Enrolment> {
    @Override
    public int compare(Enrolment o1, Enrolment o2) {
        return o1.getStudent().getId().compareTo(o2.getStudent().getId());
    }
}
