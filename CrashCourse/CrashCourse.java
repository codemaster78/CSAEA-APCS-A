public class CrashCourse{
    public static void main(String[] args){

        // Printing
        System.out.println("hello");

        //Primitive Variables
        int a;
        double b;
        boolean c;

        a = 4;
        b = 5.5;
        c = false;

        //Arithmatic Operators
        int d = 3;
        d += 7;

        System.out.println("d = " + d);

        //incriment and decrement by 1
        d --;
        d++;
        d++;
        System.out.println("d = " + d);

        //Comparisons - return a boolean (<, >, <=, >=, ==, !=)
        System.out.println(4<5);
        System.out.println(3==3);
        System.out.println(3!=3);

        //Logical Operators (! - not, && - and, || - or)
        //In order of precidence: Not, And, Or

        boolean e = false; boolean f = true;

        System.out.println(!e); //true
        System.out.println(e && f); //false
        System.out.println(e || f); //true
        System.out.println(e || f && !e); //true
    }
}