package DataTypes;

public class NonPrimitiveData {
    public static void main(String[] args) {
    // Everything that is typed here with the PSVM command will be compiled by Java
        /*
        * Non-primitive Data: String, Array, Class, enum
        * Objective of the class: Create a ninja and assign methods to him.
        */

        String name = "Naruto Uzumaki";
        String nameUpperCase =  name.toUpperCase(); //It will put everything in CAPSLOCK
        System.out.println("This text is in CAPSLOCK: " + nameUpperCase);
        System.out.println("This text is normal: " + name);

        String village = "LEAF VILLAGE";
        String villagelowercase = village.toLowerCase(); // ToLowerCase will lowercase everything
        System.out.println(villagelowercase);

    }
}
