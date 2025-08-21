package IntermediaryLevel.Encapsulation;

public enum MissionsRank {

    D("Low", 2),
    C("Moderate", 3),
    B("Comfortable", 4),
    A("High", 5),
    S("Very High", 12);

    private String descrition;
    private int difficulty;

    MissionsRank(String descrition, int difficulty) {
        this.descrition = descrition;
        this.difficulty = difficulty;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
