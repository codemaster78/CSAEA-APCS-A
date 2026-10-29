public class secret{
    private String secret;
    public secret(String secret){
        this.secret = secret;
    }
    public boolean checkBroken(String attempt){
        return attempt == secret;
    }
    public boolean check(String attempt){
        return secret.equals(attempt);
    }
    public boolean sameAs(String password, String other){
        return other.equals(password);
    }
    public void change(String password1, String password2){
        if (password1.equals(password2) && !password1.equals(this.secret)){
            secret = password1;
        }
    }
    public boolean isSafe(String user){
        return secret.indexOf(user)!= -1 && !secret.equals("password");
    }
    public String toString(){
        return this.secret;
    }
}