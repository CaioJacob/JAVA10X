package BasicLevel;

public class Ternary {
    public static void main(String[] args) {

        /*
        Ternary: These are ways to reduce code
        Variable = (condition) ? trueValue : falseValue
         */

        short numberOfMissions = 11;
        String nivel = (numberOfMissions >= 10) ? "This ninja has more than 10 missions" : "This ninja has less than 10 missions";
        System.out.println(nivel);


    }
}
