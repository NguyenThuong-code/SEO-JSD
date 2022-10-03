package CourseMan;

import java.util.Calendar;

public class Enrolment {
    private Student student;
    private Modules module;
    public float internalMark;
   public float examinationMark;
    private String finalGrade;

    public Enrolment(Student student, Modules module) {
        this.student = student;
        this.module = module;
    }

    public Enrolment(Student student, Modules module, float internalMark, float examinationMark) {
        this.student = student;
        this.module = module;
        this.internalMark = internalMark;
        this.examinationMark = examinationMark;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Modules getModule() {
        return module;
    }

    public void setModule(Modules module) {
        this.module = module;
    }

    public float getInternalMark() {
        return internalMark;
    }

    public void setInternalMark(float internalMark) {
        this.internalMark = internalMark;
    }

    public float getExaminationMark() {
        return examinationMark;
    }

    public void setExaminationMark(float examinationMark) {
        this.examinationMark = examinationMark;
    }

    public String getFinalGrade() {
        double aggregatedMark=(0.4* internalMark+0.6*examinationMark);
        if (aggregatedMark >=9f){
            finalGrade="E";
        }else if(aggregatedMark>=7){
            finalGrade="G";
        }else if(aggregatedMark>=5f){
            finalGrade="P";
        }else {
            finalGrade="F";
        }
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    @Override
    public String toString() {
        return "CourseMan.Enrolment{" +
                "student=" + student +
                ", module=" + module +
                '}';
    }

    public String toString(String a) {
        return "CourseMan.Enrolment{" +
                "student=" + student +
                ", module=" + module +
                ", internalMark=" + internalMark +
                ", examinationMark=" + examinationMark +
                ", finalGrade='" + getFinalGrade() + '\'' +
                '}';
    }
}
