public class Classmate {
    String charecterName;
    boolean isWorking;
    int attentionLevel;
    int energyLevel = 100;
    int stressLevel = 0;
    double GPA;
    double multiplier = 1.0;

    public Classmate(String charecterName, boolean isWorking, double GPA){
        this.charecterName = charecterName;
        this.isWorking = isWorking;
        this.GPA = GPA;
    }

    public void dowork(){
        isWorking = true;
        stressLevel += 10;
        energyLevel -= 10;

        if (stressLevel > 100){
            stressLevel = 100;
        }

        if (energyLevel > 100){
            energyLevel = 100;
        }
    }

    public void talktofriends(){
        isWorking = false;
        attentionLevel -= 10;
        stressLevel -= 10;

        if (stressLevel < 0){
            stressLevel = 0;
        }

        if (energyLevel < 0){
            energyLevel = 0;
        }
    }

    public void taketest(){
        stressLevel += 25;

        if (stressLevel > 100){
            stressLevel = 100;
        }
    }

    public void eat(){
        energyLevel += 25;
        isWorking = false;

        if (energyLevel > 100){
            energyLevel = 100;
        }
    }
}
