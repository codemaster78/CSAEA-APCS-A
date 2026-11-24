// ArrayLists are dynamic lists that store multiple objects (not primitives like int, double, or boolean)
// Unlike arrays, they can grow and shrink while the program runs
// AP CS A only uses: size(), add(obj), add(index, obj), get(index), set(index, obj), remove(index)


import java.util.ArrayList;

// import java.util.*;

public class ArrayLists {

    public static ArrayList<String> createList() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("donkey");
        animals.add("pangolin");
        animals.add("blobfish");  
        animals.add("cat"); 

        return animals;
    }

    public static void showIndex(ArrayList<String> animals) {
        System.out.println("First element: " + animals.get(0));
        System.out.println("Second element: " + animals.get(1));
        System.out.println("Last element: " + animals.get(animals.size() - 1));
    }

    // linear search: returns the index of target, or -1 if not found
    // -1 is a signal value meaning "not found," never a real index

    public static int findIndex(ArrayList<String> list, String target) 
    {
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(target)) {
                return i;
            }

        }

        return -1;
    }

    public static void ModifyAnimals(ArrayList<String> animals){
        animals.set(0,"babirusa");
        animals.add("glass frog"); // appends to the end
        animals.add(3, "aye-aye");
        animals.add(1, "camel");

    
        String removed = animals.remove(0);
        System.out.println("Removed animal:" + removed);

        System.out.println("Modified animal ArrayList" + animals);
    }

    public static void membershipCheck(ArrayList<String> animals) {

        boolean found = false; 
        String target = "cat";

        for (int i = 0; i > animals.size(); i++){
            if (animals.get(i).equals(target)){
                found = true;
            }
        }
        if (found){
            System.out.println("found "+target);
        }
        else{
            System.out.println("target not found");
        }
    }

    public static void copyList(){
        ArrayList<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        ArrayList<Integer> copied = new ArrayList<>();

        for (int i:original){
            copied.add(i);
        }

        copied.add(5);

        System.out.println("Original List: " + original);
        System.out.println("Copied List: " + copied);
    }
    
    public static void removeShortNames(ArrayList<String> animals) {
        for (int i = animals.size() - 1; i >= 0; i--) {
            if (animals.get(i).length() <= 5) {
                animals.remove(i);
            }
        }

    }

         /* ===== CHECKPOINT 3: Removing While Traversing =====
     * CHALLENGE:
     * Write removeAll(ArrayList<String> animals, String target) that removes EVERY copy of target.
     * Use the same backward loop as removeShortNames, but match with .equals like findIndex.
     * Example: [cat, dog, cat, emu], remove "cat"  ->  [dog, emu]
     * Tools:   backward for loop, size(), get(i), remove(i), .equals()
     *
  */
    public static void removeAll(ArrayList<String> animals, String target){
        for (int i = animals.size() - 1; i >= 0; i--) {
            if (animals.get(i).equals(target)) {
                animals.remove(i);
            }
        }
    }
         /* ===== CHECKPOINT 4: Putting It All Together =====
     * CHALLENGE:
     * Write longNames(ArrayList<String> animals) that RETURNS A NEW list of every name longer
     * than the average name length. Along the way, print the longest name and whether
     * "glass frog" is in the list. Use ONLY enhanced for loops.
     * (Why can't you just remove the short names inside an enhanced for loop?)
     * Example: [cat, pangolin, emu, glass frog]  ->  average 6.0, returns [pangolin, glass frog]
     *          prints  Longest: glass frog   Has glass frog: true
     * Tools:   enhanced for, accumulator, min/max tracking, boolean flag, .equals(),
     *          (double) cast, building a new list with add(obj)
     * Steps:   set up total = 0, longest = list.get(0), and hasFrog = false,
     *          loop once to add each length to total, update longest, and flag "glass frog",
     *          compute avg as a double AFTER the loop, make an empty result list,
     *          loop a second time and add each name longer than avg, print longest and hasFrog,
     *          return result
     * Hint:    you need TWO loops -- you can't compare to the average until you've seen every name
     *
*/
public static ArrayList<String> longNames(ArrayList<String> animals){
    int count = 0;

    String max = animals.get(0);
    boolean glassfrog = false;
    for (String i:animals){
        count += i.length();
        if (i.equals("glass frog")){glassfrog = true;}
        if (max.length() > i.length()){max = i;} 
    }
    ArrayList<String> newanimals = new ArrayList<>(); 
    double avg = (double) count/animals.size();
    for (String i:animals){
        if (i.length()>avg){newanimals.add(i);}
    }
    System.out.println("average: "+avg+"Hasfrog: "+glassfrog+"longest: "+max);
    return newanimals;
}
}