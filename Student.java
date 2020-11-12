package sk.kosickaakademia.matorudolf.files.files.students;

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private int age;
    private double height;
    private int weight;
    private Contact contact;

    public Student(String firstName, String lastName, String id, double height, int weight ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.height=height;
        this.weight=weight;
        contact=null;
        setAge();
    }

    private void setAge() {
        // tu urobime nastavenie veku

        age=15;
    }

    public Gender getGender(){
        return id.charAt(2)<'2' ? Gender.MALE:Gender.FEMALE;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
