public class Book {
    private String name;
    public Book(){
        this.name = "name_default";
        System.out.println("name : "+ this.name);
    }
    public Book(String name) {
        this.name = name;
    }
}
