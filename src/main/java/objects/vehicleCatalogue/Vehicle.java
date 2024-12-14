package objects.vehicleCatalogue;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {

        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(type).append("\n")
                .append("Model: ").append(model).append("\n")
                .append("Color: ").append(color).append("\n")
                .append("Horsepower: ").append(horsepower);

        return sb.toString();
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
