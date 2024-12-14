package objects.opinionPoll_03;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(name + " - " + age);

        return sb.toString();
    }
}
