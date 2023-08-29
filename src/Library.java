public class Library {
    public static void main(String[] args) {
        // Instantiate two author classes
        Author author1 = new Author("Lucy Megatroid", "lucymegano@hotmail.co.uk", 'f');
        Author author2 = new Author("Ben Franklin", "bennyfranky@outlook.com", 'm');

        // Instantiate three book classes
        Book book1 = new Book("How to code for dummies", author1, 7.50);
        Book book2 = new Book("Beneath the world, a sea", author2, 11.13, 2);
        Book book3 = new Book("Computer Systems A Programmers Perspective (3rd)", author1, 2.99, 10);

        // Print out the information of the books and thier authors
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
    }
}
