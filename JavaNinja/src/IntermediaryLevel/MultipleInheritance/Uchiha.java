package IntermediaryLevel.MultipleInheritance;

public class Uchiha extends Ninja implements ShariganInterface{

    public Uchiha() {
    }

    public Uchiha(String name, String village, int age) {
        super(name, village, age);
    }

    /*
    * Method:
    * Implements interface Sharingan
     */
    public void shariganActivated(){
        System.out.println(name + ": Sharigan Activated!");
    }

}
