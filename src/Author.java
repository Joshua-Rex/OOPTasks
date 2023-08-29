public class Author {

    // Variables used within the author class
    private String name;
    private String email;
    private char gender;

    // Constructor for the author class
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Returns the author's information in string format
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
