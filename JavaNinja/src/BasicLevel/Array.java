package BasicLevel;

public class Array {
    public static void main(String[] args) {

        // Arrays are reference types.
        String[] ninja = new String[6];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja[5]);

        int[] age = new int[2];
        age[0] = 16;
        System.out.println(age[1]);

        boolean[]   trueOrFalse = new boolean[2];
        System.out.println(trueOrFalse[0]);

        double[]  doubles = new double[2];
        System.out.println(doubles[0]);

        /*
        String initializes as null;
        int initializes as 0;
        boolean initializes as false;
        double initializes as 0.0;
         */

    }
}
