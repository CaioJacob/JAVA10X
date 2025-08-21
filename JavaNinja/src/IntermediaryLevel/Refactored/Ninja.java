package IntermediaryLevel.Refactored;

public abstract class Ninja implements BattleStrategy {

    //TODO: Include new 2 attributes: numberOfMissionsCompleted , Rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String name;
    String village;
    int age;
    int numberOfMissionsCompleted;
    LevelNinja rank;

    public Ninja() {
    }

    // EVERY NINJA WILL DO NECESSARILY
    final void throwKunai() {
        System.out.println("I AM A METHOD OF THE MOTHER CLASS");
    }

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    // TODO: Overloading the constructor calling the new attributes
    // Methods overloads you don't need redeclare the constructor only the new attributes.
    public Ninja(String name, String village, int age, int numberOfMissionsCompleted, LevelNinja rank) {
        this(name, village, age);
        this.numberOfMissionsCompleted = numberOfMissionsCompleted;
        this.rank = rank;
    }

    // General methods! All ninjas will have.
    public void specialSkill() {
        System.out.println("My name is " + name +" and this is my special attack");
    }

    // Overriding the interface method
    @Override
    public void ninjaBattleStrategy() {
        System.out.println( "My name is: " + name +". This is my combat strategy");
    }

    // Combat Intelligence - Standard Method
    public void combatIntelligence() {
        System.out.println("My name is: " + name +". This is my combat intelligence");
    }

    // Combat Intelligence - Method overload
    public void combatIntelligence(int qi) {

            if (qi > 150) {
                System.out.println("Your QI is: " + qi +" and you are a genius ");
            } else if ( qi >= 130 ) {
                System.out.println("Your QI is: " + qi +" and you are a promising ninja ");
            } else {
                System.out.println("Your QI is:" + qi + " and you need to train your strategies more");
            }

    }

    // Method without @Overrride
    public void provisionalMethod() {
        System.out.println("Ninja class test");
    }



}
