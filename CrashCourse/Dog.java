public class Dog {
    
    String name;
    String ownerName;
    String breed;
    int age;
    double weight;
    boolean isHungry;
    int energyLevel;

    public Dog(String name, String ownerName, String breed) {
        this.name = name;
        this.ownerName = ownerName;
        this.breed = breed;

        energyLevel = 100;
        age = 0;
        isHungry = false;
        weight = 15.0;
    }

    public void birthday(){
        age += 1;
        System.out.println("Age: "+age);
    }

    public void eat(){
        isHungry = false;
        energyLevel += 10
        weight += 1;

        if (energyLevel>100){
            energyLevel = 100;
        }
    }

    public void walk(){
        energyLevel -= 10;
    }
}