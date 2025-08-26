package IntermediaryLevel.LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

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


    }
}
