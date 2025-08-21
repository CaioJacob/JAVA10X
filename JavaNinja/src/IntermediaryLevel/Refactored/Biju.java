package IntermediaryLevel.Refactored;

public enum Biju {

    SHUKAKU(1,"Shukaku","Gaara"),
    MATATABI(2, "Matatabi", "Yugito Nii"),
    ISOBU(3, "Isobu", "Yagura"),
    SON_GOKU(4, "Son Goku", "Roshi"),
    KOKUO(5, "Kokuo", "Han"),
    SAIKEN(6, "Saiken", "Utakata"),
    CHOMEI(7, "Chomei", "Fuu"),
    GYUKI(8, "Gyuki", "Killer Bee"),
    KURAMA(9, "Kurama", "Naruto Uzumaki");

    int numberOfTails;
    String bijuName;
    String jinchuriki;

    Biju() {
    }

    Biju(int numberOfTails, String bijuName, String jinchuriki) {
        this.numberOfTails = numberOfTails;
        this.bijuName = bijuName;
        this.jinchuriki = jinchuriki;
    }
}
