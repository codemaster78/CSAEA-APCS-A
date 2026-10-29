// package Fundimental-Lessons.Methods.indexOf;

public class EmailTester {
    public static void main(String[] args) {
        Email e = new Email("Rudy.Middela@gmail.com");

        System.out.println(e);
        System.out.println(e.getDomain());
        System.out.println(e.getUser());
        System.out.println(e.getFirstName());
        e.changeDomain("google.com");
        System.out.println(e);
        System.out.println(e.getLabel());

        Email em = new Email("Rudy.Middela@hcvsd.org");

        System.out.println(e.isStaffFormat());
        System.out.println(em.isStaffFormat());
    }
}
