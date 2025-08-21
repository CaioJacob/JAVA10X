package IntermediaryLevel.Encapsulation;

public abstract class Ninja {

    private String name;
    private String village;
    private int age;
    private int numberOfMissionsCompleted;
    private double height;

// Take data or show it to the user. We use Get + Variable Name
//    public String getName() {
//        return name;
//    }
//
// Setter receives values
//    public void setName(String name) {
//        this.name = name;
//    }


    public Ninja() {
    }

    public Ninja(String name, String village, int age, int numberOfMissionsCompleted, double height) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.numberOfMissionsCompleted = numberOfMissionsCompleted;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfMissionsCompleted() {
        return numberOfMissionsCompleted;
    }

    public void setNumberOfMissionsCompleted(int numberOfMissionsCompleted) {
        this.numberOfMissionsCompleted = numberOfMissionsCompleted;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
