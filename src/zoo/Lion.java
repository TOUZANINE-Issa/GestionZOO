package zoo;

public class Lion extends Animal {
    public Lion(String nom, int age) {
        super(nom, age);
    }

    public static void faireDuBruit1() {
        System.out.println(nom + " rugit !");
    }

    public static void seDeplacer1() {
        System.out.println(nom + " court majestueusement.");
    }

}