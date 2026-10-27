/*
 * Song: blueprint for Song objects.
 * New method: toString()
 *
 * toString() returns a String that describes an object.
 * Header -- copy it exactly:   public String toString()
 * It RETURNS text. It does not print.
 */

public class Song {
    // intance variables
    private String title;
    private String artist;
    private int plays;
    private String stars = "";

    //constructor
    public Song(String title,String artist){
        this.title = title;
        this.artist = artist;
        plays = 0;
    }

    //methods. behaviors
    public void play(){
        plays++;
    }

    public String getStars(){
        for(int i = 0; i < plays; i++)
            stars += "*";
        return stars;
    }

    public int getPlays(){
        System.out.println(plays);
        return plays;
    }

    public String toString(){
        if (plays > 1){
            return title + " - " + artist + " - " + plays + " plays";
        }
        else{
            return title + " - " + artist + " - " + plays + " play";
        }
        
    }

}
