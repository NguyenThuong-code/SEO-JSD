package CourseMan;

public class CompulsoryModule extends Modules {
    public CompulsoryModule() {
    }

    public CompulsoryModule( String name, int semester, int credit) {
        super( name, semester, credit);
    }

    @Override
    public String toString() {
        return "CourseMan.CompulsoryModule{" +
                super.toString()+
                "}";
    }
}
