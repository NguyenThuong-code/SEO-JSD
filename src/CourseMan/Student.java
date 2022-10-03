package CourseMan;

import java.time.LocalDate;
import java.util.Calendar;

public class Student {
    private static int count = 0;
    private String id;
    private String name;
    private LocalDate dob;
    private String address;
    private String email;

    public Student() {
    }

    public Student( String name, LocalDate dob, String address, String email) {
        int current = Calendar.getInstance().get(Calendar.YEAR);
        this.id = "S" + (current + (count++));
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CourseMan.Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
