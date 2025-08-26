package Challenges.SixthChallenge;

public class Ninjas {

    private String name;
    private int age;
    private String Village;

    public Ninjas(String name, int age, String village) {
        this.name = name;
        this.age = age;
        Village = village;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVillage() {
        return Village;
    }

    public void setVillage(String village) {
        Village = village;
    }

    @Override
    public String toString() {
        return "Ninja {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Village='" + Village + '\'' +
                '}';
    }
}
