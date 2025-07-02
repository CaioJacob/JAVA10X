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
        //System.out.println(ninja[5]);

        // Redeclare the ARRAY
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        //System.out.println(ninja[0]);

        // FOR to loop through ARRAY
        for (int i = 0; i < ninja.length; i++) {
            System.out.println(ninja[i]);

        }

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
