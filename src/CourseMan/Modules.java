package CourseMan;

import java.util.HashMap;

public class Modules {
    private static final HashMap<Integer, Integer> countList = new HashMap<>();
    private String code;
    private String name;
    private int semester;
private int credit;

    public Modules() {
    }

    public Modules( String name, int semester, int credit) {
        if (!countList.containsKey(semester)) {
            countList.put(semester, 0);
        }
        countList.put(semester, countList.get(semester) + 1);
        this.code = "M" + ((semester * 100) + (countList.get(semester)));
        this.name = name;
        this.semester = semester;
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", semester=" + semester +
                ", credit=" + credit
               ;
    }
}
