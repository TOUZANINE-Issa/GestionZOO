package zoo;

public class Serpent extends Animal {
    public Serpent(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void seDeplacer() {

    }

    public static void faireDuBruit3() {
        System.out.println(nom + " siffle !");
    }


    public static void seDeplacer3() {
        System.out.println(nom + " rampe silencieusement.");
    }
}
