package Conditions;

public class IfAndElse {
    public static void main(String[] args) {

        /*
        * IF and ELSE - Conditions
        * Else IF
        * Objective: Pass the ninja according to the number of missions
        * */

        String name = "Naruto Uzumaki";
        String rank = "";
        int age = 10;
        boolean hokage = false;
        short   numberOfMissions = 9;

        /*
        * if(condition) {result}
        * else if (condition) {result}
        * else {result if nothing is true}
        * */


        if (numberOfMissions==10 && age>15){
            System.out.println("Rank: Chunin");
        }else if (numberOfMissions>=20){
            System.out.println("Rank: Jounin");
        }else {
            System.out.println("Rank: Genin");
        }
    }

}
