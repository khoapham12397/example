public class Room {
    public static void main(String[] args) {
        Teacher tc = new Teacher("khoa","khoa@gmail.com");
        Student st = new Student(tc);
        tc.addStudent(st);
        System.out.println(st.getTeacher().getName());
    }
    // dau tien cu thu add .     
}
