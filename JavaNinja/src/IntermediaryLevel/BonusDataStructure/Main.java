package IntermediaryLevel.BonusDataStructure;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Arrays

        String[] ninjaNameArray = new String[5];

        System.out.println("----------- Array ----------");
        ninjaNameArray[0] = "Naruto Uzumaki";
        ninjaNameArray[1] = "Sasuke Uchiha";
        ninjaNameArray[2] = "Sakura Haruno";
        ninjaNameArray[3] = "Hinata Hyuuga";
        System.out.println("Ninja Name Array: " + ninjaNameArray);
        System.out.println("Ninja Name Array[4]: " + ninjaNameArray[4]);

        // List is a little slower compared to array
        System.out.println("----------- List ----------");
        List<String> ninjaNameList = new ArrayList<>();
        ninjaNameList.add("Naruto Uzumaki");
        ninjaNameList.add("Sasuke Uchiha");
        ninjaNameList.add("Sakura Haruno");
        ninjaNameList.add("Hinata Hyuuga");
        System.out.println(ninjaNameList);

        System.out.println("----------- Stack ----------"); //FILO (First In, Last Out)
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        ninjaStack.push("Hinata Hyuuga");
        System.out.println(ninjaStack);
        System.out.println("Remove Ninja Name: " + ninjaStack.pop());
        System.out.println(ninjaStack);
        System.out.println("Top Ninja Name: " + ninjaStack.peek());
        System.out.println(ninjaStack);

        System.out.println("----------- Queue ----------"); // FIFO (First In, First Out)
        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Sakura");
        ninjaQueue.add("Kakahi");
        ninjaQueue.add("Shikamaru");
        System.out.println("Queue of Ninjas: " + ninjaQueue);
        ninjaQueue.poll(); // Removes the head from the list
        System.out.println(ninjaQueue);
        System.out.println("Head Ninja Name: " + ninjaQueue.peek());
        ninjaQueue.add("Hashirama");
        ninjaQueue.add("Tobirama");
        System.out.println(ninjaQueue);
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();

        if(ninjaQueue.isEmpty()){
            System.out.println("Ninja Queue is Empty");
        }


    }

}
