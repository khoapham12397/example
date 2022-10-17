import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String email;
    private List<Student> students;

    public Teacher(String name, String email) {
        this.name = name;
        this.email = email;
        students = new ArrayList<>();
    }
    public void addStudent(Student st){
        students.add(st);
    }
    public Teacher(){}
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }   
}
