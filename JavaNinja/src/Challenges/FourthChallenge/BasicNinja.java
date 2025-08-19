package Challenges.FourthChallenge;

public class BasicNinja implements Ninja{

    String name;
    int age;
    String skill;

    public BasicNinja(String name, int age, String skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    @Override
    public void showInformations(){
        System.out.println("Basic Ninja: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Skill: " + skill);
    }

    @Override
    public void peformSkill(){
        System.out.println(name + " is executing the skill " + skill);
    }


}
