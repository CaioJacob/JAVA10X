package Challenges;

public class FirstChallenge {
    public static void main(String[] args) {

        //Creating Naruto
        String name = "Naruto Uzumaki";
        int age = 14;
        String mission = "Help at the Ramen stand";
        char difficultyLevel = 'D';
        String status ="";

        if(age<15) {
            if (difficultyLevel == 'C' || difficultyLevel == 'D') {
                status = "Completed";
            } else {
                status = "Not Completed";
            }
        }else {
                status = "Completed";
        }

        System.out.println(name + " at " + age + " years old received the mission of " + mission + " of difficulty " + difficultyLevel + " and its status is: " + status + ".");
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        //Creating Sasuke
        String name2 = "Sasuke Uchiha";
        int age2 = 14;
        String mission2 = "Hunt some bandits";
        char difficultyLevel2 = 'S';
        String status2 ="";

        if(age2<15) {
            if (difficultyLevel2 == 'C' || difficultyLevel2 == 'D') {
                status2 = "Completed";
            } else {
                status2 = "Not Completed";
            }
        }else {
            status2 = "Completed";
        }


        System.out.println(name2 + " at " + age2 + " years old received the mission of " + mission2 + " of difficulty " + difficultyLevel2 + " and its status is: " + status2 + ".");
        System.out.println("------------------------------------------------------------------------------------------------------------------");

        //Creating Sakura
        String name3 = "Sakura Haruno";
        int age3 = 15;
        String mission3 = "Help in the hospital";
        char difficultyLevel3 = 'C';
        String status3 ="";

        if(age3<15) {
            if (difficultyLevel3 == 'C' || difficultyLevel3 == 'D') {
                status3 = "Completed";
            } else {
                status3 = "Not Completed";
            }
        }else {
            status3 = "Completed";
        }

        System.out.println(name3 + " at " + age3 + " years old received the mission of " + mission3 + " of difficulty " + difficultyLevel3 + " and its status is: " + status3 + ".");


    }
}
