public class SpeedSkater {

    private String name;
    private int age;
    private int energy;
    private boolean citizen;
    private double onelap;

    public SpeedSkater(String name, int age, boolean citizen){
        this.name = name;
        this.age = age;
        this.citizen = citizen;
        energy = 100;
        onelap = 15.0;
    }

    public void Training(int hours){
        onelap -= hours/10;
        System.out.println("Current one lap: "+onelap);
        energy -= hours;

        if (energy<100){
            energy = 100;
        }
        else if (energy>100){
            energy = 100;
        }
        System.out.println("Energy: "+energy);
    }

    public void sleep(int hours){
        energy+=hours;

        if (energy<100){
            energy = 100;
        }
        else if (energy>100){
            energy = 100;
        }
        System.out.println("Energy: "+energy);
    }
    public void eat(){
        energy+=5;
        if (energy<100){
            energy = 100;
        }
        else if (energy>100){
            energy = 100;
        }
        System.out.println("Energy: "+energy);
    }
    public void WorldTeamTrials(){
        if (citizen && age>=15){
            System.out.println("Did you make world team: "+(onelap<8.5));
        }
        else{
            System.out.println("You are not eligble for the world team");
        }
    }
    public void SlackOff(int hours){
        onelap += hours/10;
    }
}
