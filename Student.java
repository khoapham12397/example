import java.util.Scanner;
public class Student {
    private Teacher myTeacher;
    private String name; 
    
    public Student(Teacher tc){
        this.myTeacher = tc;
        this.name = "default";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher(){
        return myTeacher;
    }
}










