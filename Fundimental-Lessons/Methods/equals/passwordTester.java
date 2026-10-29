public class passwordTester {
    public static void main(String[] args) {
        // String a = "lion";
        // String b = new String("lion");

        // System.out.println(a);
        // System.out.println(b);

        // System.out.println(a == b);
        // System.out.println(a.equals(b));

        // String cut = "dandilion".substring(5);
        // System.out.println(cut);

        // System.out.println(a == cut);
        // System.out.println(a.equals(cut));

        secret p = new secret("lion");
        String attempt = new String("lion");

        System.out.println(p.checkBroken(attempt));
        System.out.println(p.check(attempt));

        p.change("attempt", "attempt");
        System.out.println(p);
    }
}
