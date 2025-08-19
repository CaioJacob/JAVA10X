package Challenges.FourthChallenge;

public class AdvancedNinja implements Ninja{

    String name;
    int age;
    String skill;
    String specialty;

    public AdvancedNinja(String name, int age, String skill, String specialty) {
        this.name = name;
        this.age = age;
        this.skill = skill;
        this.specialty = specialty;
    }

    @Override
    public void showInformations() {
        System.out.println("Advanced Ninja: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Skill: " + skill);
        System.out.println("Specialty: " + specialty);
    }

    @Override
    public void peformSkill() {
        System.out.println(name + " is executing the skill " + skill + " with " + specialty + " speciality!");
    }

}
