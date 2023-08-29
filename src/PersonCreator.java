public class PersonCreator {

    public static void main(String[] args) {
        // Instantiates two new person classes
        Person person1 = new Person("James Peterson", (byte)34, (short)180, 73.5f);
        Person person2 = new Person("Bob Thornley", (byte)25, (short)171, 68.2f);

        // Prints the details of the person classes
        printPerson(person1);
        printPerson(person2);

        // Increases the age of person 1 and prints their information again
        person1.growOlder();
        printPerson(person1);

    }

    // Prints the information of the person classes
    private static void printPerson(Person p) {
        System.out.println("Person's name = " + p.getName());
        System.out.println(p.getName() +" age = " + p.getAge());
        System.out.println(p.getName() + " weight = " + p.getWeight());
        System.out.println(p.getName() + " height = " + p.getHeight() + "\n");
    }


}
