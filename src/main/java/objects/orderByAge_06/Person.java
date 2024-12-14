package objects.orderByAge_06;

public class Person {

    private String name;
    private String id;
    private int age;

    public Person(String name, String id, int age) {

        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        //Stephan with ID: 524244 is 10 years old.
        sb.append(name).append(" with ID: ").append(id)
                .append(" is ").append(age).append(" years old.");

        return sb.toString();
    }
}
