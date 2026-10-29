// package Fundimental-Lessons.Methods.indexOf;

public class Email {
    private String address;

    public Email(String addr){
        this.address = addr; 
    }

    public String toString(){
        return address;
    }
    // public boolean isSchool(){
    //     if(address.indexOf("edu") != -1){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
    public int getAtIndex(){
        return address.indexOf("@");
    }
    public String getUser(){
        return address.substring(0,address.indexOf("@"));
    }
    public String getDomain(){
        return address.substring(address.indexOf("@")+1);
    }
    public String getFirstName(){
        String user = this.getUser();
        return user.substring(0,address.indexOf("."));
    }
    public void changeDomain(String NewDomain){
        address = this.getUser()+"@"+NewDomain;
    }
    public boolean isSchool(){
        return address.indexOf("hcvsd.org") != -1;
    }
    public String getLabel(){
        if (this.isSchool()){
            return "School: " + address;
        }
        else{
            return "Personal: " + address;
        }
    }
    public boolean isStaffFormat(){
        return this.getUser().indexOf(".") != -1 && this.getDomain().indexOf("hcvsd.org") != -1;
    }
}
