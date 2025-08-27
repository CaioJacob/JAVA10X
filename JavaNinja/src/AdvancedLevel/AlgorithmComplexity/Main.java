package AdvancedLevel.AlgorithmComplexity;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long start;
        long end;
        long time;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // O(n)
        for (int i = 0; i < 2090500; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        start = System.nanoTime();

        // verify the index number .
        arrayList.get(250);

        end = System.nanoTime();
        time = end - start;
        System.out.println("Time Array List: " + time + " ns");

        start = System.nanoTime();

        linkedList.get(250);

        end = System.nanoTime();
        time = end - start;
        System.out.println("Time Linked List: " + time + " ns");


        // Add a number.
        arrayList.add(250);

        end = System.nanoTime();
        time = end - start;
        System.out.println("Time Array List Adding: " + time + " ns");

        start = System.nanoTime();

        linkedList.add(250);

        end = System.nanoTime();
        time = end - start;
        System.out.println("Time Linked List Adding: " + time + " ns");

        // Remove a number.
        arrayList.remove(250);

        end = System.nanoTime();
        time = end - start;
        System.out.println("Time Array List Removing: " + time + " ns");

        start = System.nanoTime();

        linkedList.remove(250);

        end = System.nanoTime();
        time = end - start;
        System.out.println("Time Linked List Removing: " + time + " ns");


        /*/
        ** Main Time Complexity Classes **

        O(1) – Constant
        The algorithm runs in the same time regardless of the input size.

        O(log n) – Logarithmic
        The runtime grows logarithmically with the input size. Common in algorithms that divide the input in half at each step, such as binary search.

        O(n) – Linear
        The runtime grows linearly with the input size. Example: iterating through all elements of a list.

        O(n log n) – Linearithmic
        A combination of linear and logarithmic growth, common in efficient sorting algorithms such as mergesort and heapsort.

        O(n²) – Quadratic
        The runtime increases quadratically with the input size. Example: simple sorting algorithms such as bubble sort.

        O(2ⁿ) – Exponential
        The runtime doubles with each unit increase in input size. Common in brute force algorithms that explore all possible combinations, such as in subset-sum problems.

         */

    }
}
