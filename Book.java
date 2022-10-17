public class Book {
    private String name;
    public Book(){
        this.name = "name_default";
        System.out.println("name : hello");
    }
    public Book(String name) {
        this.name = name;
    }
}
