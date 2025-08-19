package IntermediaryLevel.MultipleInheritance;

public class Hatake extends Ninja implements ShariganInterface, AmbuInterface {

    public void welcome(){
        System.out.println(name + ": I am a Hatake!");
    }

    public void shariganActivated(){
        System.out.println(name + ": Sharigan Activated!");
    }

    public void eliteNinja(){
        System.out.println(name + ": I am an Ambu ninja!");
    }

    public void hokageActivated(){
        System.out.println(name + ": I am a Hokage!");
    }

}
