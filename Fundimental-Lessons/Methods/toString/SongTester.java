public class SongTester {
    public static void main(String[] args) {
        Song a = new Song("Enter Sandman","Metallica");

        a.play();
        a.play();
        a.play();
        a.play();

        a.getPlays();

        System.out.println(a);

        System.out.println(a.getStars());
    }
}
