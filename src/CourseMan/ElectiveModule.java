package CourseMan;

public class ElectiveModule extends Modules {
    private String departmentName;

    public ElectiveModule() {
    }

    public ElectiveModule(String departmentName) {
        this.departmentName = departmentName;
    }

    public ElectiveModule( String name, int semester, int credit, String departmentName) {
        super( name, semester, credit);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "CourseMan.ElectiveModule{" +
                super.toString()+
                "departmentName='" + departmentName + '\'' +
                '}';
    }
}
