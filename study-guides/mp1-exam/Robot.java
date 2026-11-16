//Class Header

import java.io.Serial;

public class Robot {
    //Instance Variables
    private String name;
    private String serial;
    private double battery;
    private boolean isOn;

    public Robot(String name, String serial, double battery){
        this.name = name;
        this.serial = serial;
        this.battery = battery;


        this.isOn = false;
    }
    public String getName(){
        return name;
    }
    public double getBattery(){
        return battery;
    }
    public String getSerial(){
        return serial;
    }
    public boolean isOn(){
        return isOn;
    }
    public void setName(String newName){
        name = newName;
    }
}
