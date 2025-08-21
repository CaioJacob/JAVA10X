package IntermediaryLevel.Encapsulation;

public class Missions {

    private String name;
    private MissionsRank rank;

    // Method to show more information

    public void displayDetails(){
        System.out.println("Mission: " + name + ". Rank: " + rank + ". (Description: " + rank.getDescrition() + ", Difficulty: " + rank.getDifficulty() + ")");
    }

    public Missions(String name, MissionsRank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MissionsRank getRank() {
        return rank;
    }

    public void setRank(MissionsRank rank) {
        this.rank = rank;
    }
}
