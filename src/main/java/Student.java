import java.util.ArrayList;

public class Student {

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public int getGradeAverage(){
        int total = 0;
        for(int i = 0; i < grades.size(); i++){
            total += grades.get(i);
        }
        return total/grades.size();
    }
}
