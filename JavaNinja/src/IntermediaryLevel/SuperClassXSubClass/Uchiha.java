package IntermediaryLevel.SuperClassXSubClass;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String name, String village, int age) {
        super(name, village, age);
    }

    public Uchiha(String name, String village, int age, int numberOfCompletedMissions, LevelNinja rank) {
        super(name, village, age, numberOfCompletedMissions, rank);
    }

    @Override
    public void specialSkill() {
        System.out.println("My name is " + name + "and I am an Uchiha, this is my Special skill. I have already completed: " + numberOfCompletedMissions + " mission(s)");
    }

    @Override
    public void combatIntelligence() {
        System.out.println("My name is " + name + "and this is my Combat Intelligence!");
    }

    @Override
    public void combatIntelligence(int qi) {
        if (qi > 150) {
            System.out.println("Your QI is: " + qi + ". You are a genius!");
        } else if (qi >= 130) {
            System.out.println("Your QI is: " + qi + ". You are a promising ninja!");
        } else {
            System.out.println("Your QI is: " + qi + ". You need to train your strategies more!");
        }
    }

    // Works even without @Override
    // It is good practice to use @Override and prevent any typing errors in the method.
    public void provisionalMethod(){
        System.out.println("Uchiha test!");
    }

}
