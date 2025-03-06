package zoo;

public class Oiseau extends Animal {
    public Oiseau(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void seDeplacer() {

    }


    public static void faireDuBruit2() {
        System.out.println(nom + " chante !");
    }


    public static void seDeplacer2() {
        System.out.println(nom + " vole dans le ciel.");
    }
}