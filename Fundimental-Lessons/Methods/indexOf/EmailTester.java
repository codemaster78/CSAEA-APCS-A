// package Fundimental-Lessons.Methods.indexOf;

public class EmailTester {
    public static void main(String[] args) {
        String word = "banana";

        System.out.println(word.indexOf("b")); // 0
        System.out.println(word.indexOf("a")); // 1
        System.out.println(word.indexOf("nan")); // 2
        System.out.println(word.indexOf("z")); // -1
        System.out.println(word.indexOf("B")); // -1
        Email e = new Email("Rudy@gmail.com");

        System.out.println(e);
        System.out.println(e.getDomain());
        System.out.println(e.getUser());
    }
}
