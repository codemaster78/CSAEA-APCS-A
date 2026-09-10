import java.util.ArrayList;

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

        //casting (converting)
        int g = (int)5.5;
        System.out.println(g);
        double h = (double)5/6;
        System.out.println(h);

        //strings
        String s1 = "Goodnight";String s2 = " and ";String s3 = "goodbye";
        String result = s1+s2+s3;
        System.out.println(result);
        result += "Cowboy.";
        System.out.println(result + "\n");

        //arrays
        int[] arry1 = new int[10];
        System.out.println(arry1);
        System.out.println("length of arry1 = " + arry1.length);

        arry1[0] = 1;
        arry1[1] = 2;
        arry1[2] = 3;

        System.out.println("Remainder = " + arry1[0] % arry1[1]);

        int[] arry2 = {1,2,3,4,5,6,7,8,9,0};

        //2D arrays
        int[][] arryGrid1 = new int[4][3];
        System.out.println(arryGrid1.length);
        System.out.println(arryGrid1[0].length);

        int[][] arryGrid2 = {{7,8,9},{4,5,6},{1,2,3}};

        System.out.println(arryGrid2[0][1]);
        System.out.println(arryGrid2[2][2]);

        //ArrayList - imported package, can be any size, lots of built in functions
        //Avoid primitive data types. there are special classes for ints, doiubles, bools and strings, they are called "wrapper classes"

        ArrayList<String> arryLst = new ArrayList<>();
        arryLst.add("Word 1");
        arryLst.add("Word 2");
        arryLst.add("Word 3");
        arryLst.add("Word 4");
        arryLst.remove(0);
        arryLst.add(0,"Word 1");
        System.out.println(arryLst.size());

        //conditionals
        boolean tru = true;
        boolean fal = false;
        if(fal) {
            System.out.println("Reached TRUE");
        } 
        
        else if (!fal){
            System.out.println("Reached ELIF");
        }

        else {
            System.out.println("Reached ELSE statement");
        }

        //iteration

        int x = 5;

        while (x<10) {
            System.out.println(x+" ");
            x++;
        }
        System.err.println();

        //for loop - init variable (for index); conditional; incriment/decriment value 
        for(int i = 0; i < 5; i++) {
            System.err.println(i);
        }

        //enhanced for loop (only for reading values)
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Sheep");
        animals.add("Deer");
        animals.add("Moose");

        System.out.println("ArrayList: "+animals);

        for (String s : animals){
            System.out.println(s);
        }

        //printing values of an array using iteration
        double[] arry = {5.1,2.2,5.3,3.4,8.5};
        System.err.println("arry memory address is: "+arry);

        for (int i = 0;i < arry.length; i++) {
            System.err.println(arry[i]);
        }

        int[][] arryMatrix = {{0,32,12},{7,13,22},{6,77,100}};

        for(int row = 0;row<arryMatrix.length;row++) {
            for (int col = 0;col<arryMatrix[row].length;col++){
                System.out.println(arryMatrix[row][col]);
            }
        }
        System.out.println();
    }
}