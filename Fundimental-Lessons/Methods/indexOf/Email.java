// package Fundimental-Lessons.Methods.indexOf;

public class Email {
    private String address;

    public Email(String addr){
        this.address = addr; 
    }

    public String toString(){
        return address;
    }
    public boolean isSchool(){
        if(address.indexOf("edu") != -1){
            return true;
        }
        else{
            return false;
        }
    }
    public int getAtIndex(){
        return address.indexOf("@");
    }
    public String getUser(){
        return address.substring(0,address.indexOf("@"));
    }
    public String getDomain(){
        return address.substring(address.indexOf(".")+1);
    }
}
