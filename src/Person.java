public class Person {

    // Variables used within the person class
    private String name;
    private byte age;
    private short height; // cm
    private float weight; // lbs

    // Constructor for the person class
    public Person(String name, byte age, short height, float weight) {
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        this.setWeight(weight);
    }

    // Getters and setters for the person class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    // Increases the person's age and decreases both the height and weight
    public void growOlder() {
        this.age++;
        this.height--;
        this.weight-=0.5f;
    }
}
