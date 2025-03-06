package zoo;

public class Serpent extends Animal {
    public Serpent(String nom, int age) {
        super(nom, age);
    }

    public static void faireDuBruit3() {
        System.out.println(nom + " siffle !");
    }

    public static void seDeplacer3() {
        System.out.println(nom + " rampe silencieusement.");
    }
}
