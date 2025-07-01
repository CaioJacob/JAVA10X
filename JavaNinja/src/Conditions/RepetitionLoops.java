package Conditions;

public class RepetitionLoops {
    public static void main(String[] args) {

    /*
    Repetition Loops: Will repeat infinitely or until you reach the desired parameter.
    WHILE = FOR
     */

    // While
    // while (condition) {Everything here will happen}

    int numberOfClones = 0;
    int maximumNumberOfClones = 40;

//    while (numberOfClones <= maximumNumberOfClones) {
//        numberOfClones++;
//        System.out.println("Naruto made a shadow clone " + numberOfClones);
//    }

    // For

    for (int i = 0; i <= maximumNumberOfClones; i++) {
        System.out.println("Naruto is cloning himself and has already cloned himself " + i);
    }



    }
}
