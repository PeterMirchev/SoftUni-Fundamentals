package objects.students;

public class Student {

    private String firstName;
    private String lastName;
    private double grade;

    public Student(String firstName, String lastName, double grade) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //first name} {second name}: {grade}".
        sb.append(firstName).append(" ").append(lastName).append(": ").append("%.2f".formatted(grade));

        return sb.toString();
    }
}
