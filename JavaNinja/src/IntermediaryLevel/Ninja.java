package IntermediaryLevel;

public class Ninja {

    String name;
    String village;
    int age;

    // Create a custom public method
    /*
    The VOID method doesn't return any value!
     */
    public void ShariganActivated(){
        System.out.println("The Sharigan Activated!");
    }

    /*
    String method returns a String!
     */
    public String IAmANinja(){
        return "Hi, I am a ninja!";
    }

    /*
    int method returns an int!
     */
    public int AgeToBecomeHokage(int minimumAgeToBeHokage){
        return minimumAgeToBeHokage - age;
    }


}
