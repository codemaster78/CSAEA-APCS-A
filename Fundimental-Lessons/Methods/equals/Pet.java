public class Pet {
    private String name;
    private int age;
    private double weight;
    private boolean isVaccinated;

    public Pet(String name, int age, double weight, boolean isVaccinated) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isVaccinated = isVaccinated;
    }

    public String getFirstName() {
        int space = name.indexOf(" ");
        if (space == -1) {
            return name;
        }
        return name.substring(0, name.indexOf(" "));
    }

    public boolean hasSameFirstName(String otherName) {
        return getFirstName().equals(otherName);
    }

    public int humanYears() {
        return age * 7;
    }

    public boolean canGoToDogPark() {
        return isVaccinated;
    }

    public String toString() {
        return name + " is " + age + " years old and weighs " + weight + " lbs";
    }
}