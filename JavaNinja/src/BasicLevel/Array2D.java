package BasicLevel;

public class Array2D {
    public static void main(String[] args) {

        String[][] ninjasAndVillages = new String[3][3];

        ninjasAndVillages[0][0] = "Konohagakure";
        ninjasAndVillages[0][1] = "Naruto Uzumaki";
        ninjasAndVillages[0][2] = "Sasuke Uchiha";

        ninjasAndVillages[1][0] = "Kirigakure";
        ninjasAndVillages[1][1] = "Zabuza Momochi";
        ninjasAndVillages[1][2] = "Haku Yuki";

        ninjasAndVillages[2][0] = "Sunagakure";
        ninjasAndVillages[2][1] = "Gaara";
        ninjasAndVillages[2][2] = "Temari";

        for (int i = 0; i < ninjasAndVillages.length; i++) {
            System.out.println("Village: " + ninjasAndVillages[i][0]);
            for (int j = 1; j < ninjasAndVillages[i].length; j++)
            { System.out.println("Ninja: " + ninjasAndVillages[i][j]); } }

    }


}
