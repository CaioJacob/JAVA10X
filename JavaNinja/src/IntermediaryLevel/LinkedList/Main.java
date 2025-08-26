package IntermediaryLevel.LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- LinkedList ---------------");

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Naruto Uzumaki");
        linkedList.add("Sasuke Uchiha");
        linkedList.add("Sakura Haruno");

        System.out.println("LinkedList: " + linkedList);

        linkedList.add(1,"Kakashi Hatake");

        System.out.println("LinkedList: " + linkedList);

        linkedList.remove(2);

        System.out.println("LinkedList: " + linkedList);


        // Collections

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList2 = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        linkedList2.add("Naruto");
        System.out.println(linkedList2);

        // HashSet

        System.out.println("--------------- HashSet ---------------");


        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Sakura Haruno");
        ninjas.add("Naruto Uzumaki"); // Do not complain about duplicate items

        System.out.println("Ninjas List: " + ninjas);

        // If you want to use this list to use in the Set Collection:

        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjas);
        System.out.println("Ninjas List with Set: " + ninjasSet);

        Set<String> ninjaSet = new HashSet<>();
        ninjasSet.add("Naruto Uzumaki");
        ninjasSet.add("Sasuke Uchiha");
        ninjasSet.add("Sakura Haruno");
        ninjasSet.add("Naruto Uzumaki");
        ninjasSet.add("Danzo");
        ninjasSet.add("Kakashi Hatake");
        ninjasSet.add("Boruto Uzumaki");

        // LinkedHashSet - Does the same thing that a hashset does but in the order that was implemented

        System.out.println("Ninjas Set: " + ninjasSet); // Remove the duplicated item
        // The order is not necessarily in the order you implemented

        // TreeSet

        System.out.println("--------------- TreeSet ---------------");

        Set<String> treeSet = new TreeSet<>(); // Remove the duplicated itens and put in logic order
        ninjasSet.addAll(ninjasSet);
        System.out.println("Ninjas Set with TreeSet: " + treeSet);





    }
}
