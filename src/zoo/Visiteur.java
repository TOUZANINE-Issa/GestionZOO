package zoo;

public class Visiteur {
    private String nom;
    private int age;

    public Visiteur(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void interagir(Animal animal) {
        System.out.println(nom + " regarde " + animal.getNom() + " et s'émerveille !");
    }
}
