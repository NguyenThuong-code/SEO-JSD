import CourseMan.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseManProg {
    public static List<Modules> modulesList = new ArrayList<>();
    public static List<Student> studentList = new ArrayList<>();
    public static List<Enrolment> enrolmentList = EnrolmentManager.enrolmentList;
    public static EnrolmentManager em = new EnrolmentManager();
    public static void show(List<String> o){
        for(String i: o){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ElectiveModule NP = new ElectiveModule("Network Programming", 1, 22, "Information Technology");
        ElectiveModule MP = new ElectiveModule( "Mobile Programming", 1, 23, "Information Technology");

        CompulsoryModule PC = new CompulsoryModule( "Principle of Computing", 1, 23);
        CompulsoryModule SS = new CompulsoryModule( "Special Subject", 1, 12);
        CompulsoryModule SE = new CompulsoryModule("Se1", 1, 13);
        modulesList.add(NP);
        modulesList.add(MP);
        modulesList.add(PC);
        modulesList.add(SS);
        modulesList.add(SE);

        Student st1 = new Student( "John", LocalDate.of(1998, 4, 20), "Quang Binh", "1901040224@s.hanu.edu.vn");
        Student st2 = new Student("John1", LocalDate.of(1998, 4, 20), "Quang Binh", "1901040224@s.hanu.edu.vn");
        Student st3 = new Student( "John2", LocalDate.of(1998, 4, 20), "Quang Binh", "1901040224@s.hanu.edu.vn");
        Student st4 = new Student( "John3", LocalDate.of(1998, 4, 20), "Quang Binh", "1901040224@s.hanu.edu.vn");
        Student st5 = new Student( "John4", LocalDate.of(1998, 4, 20), "Quang Binh", "1901040224@s.hanu.edu.vn");
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);


        em.addEnrollment(new Enrolment(studentList.get(1), modulesList.get(2), 0, 0));
        em.addEnrollment(new Enrolment(studentList.get(0), modulesList.get(3), 0, 0));
        em.addEnrollment(new Enrolment(studentList.get(2), modulesList.get(2), 0, 0));
        em.addEnrollment(new Enrolment(studentList.get(4), modulesList.get(4), 0, 0));
        em.addEnrollment(new Enrolment(studentList.get(1), modulesList.get(1), 0, 0));
        em.addEnrollment(new Enrolment(studentList.get(3), modulesList.get(0), 0, 0));
        em.addEnrollment(new Enrolment(studentList.get(3), modulesList.get(2), 0, 0));
        em.addEnrollment(new Enrolment(studentList.get(2), modulesList.get(1), 0, 0));
        em.addEnrollment(new Enrolment(studentList.get(1), modulesList.get(4), 0, 0));
        em.addEnrollment(new Enrolment(studentList.get(4), modulesList.get(2), 0, 0));

        em.setMarks(st2, PC, 7, 9);
        em.setMarks(st1, SS, 4, 9);
        em.setMarks(st3, PC, 8, 3);
        em.setMarks(st5, SE, 6, 5);
        em.setMarks(st2, MP, 3, 4);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1:Print a non-sorted initial report of the enrolment! ");
            System.out.println("Enter 2:Print a sorted initial report of the enrolments!");
            System.out.println("Enter 3:Print a (sorted) assessment report of the enrolments on the standard output!");
            System.out.println("End the program");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    em.report();
                    break;
                }
                case "2": {
                    em.sort();
                    em.report();
                    break;
                }
                case "3": {
                    em.sort();
                    em.reportAssessment();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
                }

            }
        }

    }

