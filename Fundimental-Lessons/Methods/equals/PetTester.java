public class PetTester {
    public static void main(String[] args) {
        Pet Jamie = new Pet("Jamie Jones", 4, 12, true);
        Pet Josie = new Pet("Josie Jones", 6, 10, false);
        Pet Jackie = new Pet("Jackie Jones", 2, 8, true);

        System.out.println("Expected Jackie");
        System.out.println(Jackie.getFirstName()); //Jackie

        System.out.println("Expected true");
        System.out.println(Jamie.hasSameFirstName("Jamie")); //true
        System.out.println("Expected false");
        System.out.println(Jamie.hasSameFirstName("Jackie")); //false

        System.out.println("Expected 42");
        System.out.println(Josie.humanYears()); //42?

        System.out.println("Expected false");
        System.out.println(Josie.canGoToDogPark()); //false
        System.out.println("Expected true");
        System.out.println(Jackie.canGoToDogPark()); //true
    }
}
