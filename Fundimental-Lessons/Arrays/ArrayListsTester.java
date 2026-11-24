// write the 'skeleton' of a tester class 

import java.util.ArrayList;

public class ArrayListsTester {

    public static void main(String[] args) {

        ArrayList<String> animals = ArrayLists.createList();
    // * ===== CHECKPOINT 1: Searching and Modifying =====
    //      * CHALLENGE:
    //      * Write replaceAll(ArrayList<String> list, String oldVal, String newVal) that replaces
    //      * EVERY match, not just the first.
    //      * Example: ["cat", "dog", "cat"], replace "cat" with "fox"  ->  [fox, dog, fox]
    //      * Tools:   for loop with index i, size(), get(i), set(i, obj), .equals()

        ArrayLists.membershipCheck();
        ArrayLists.copyList();
    }
}