package zoo;

public abstract class Animal {
    protected String nom;
    protected int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public abstract void faireDuBruit();
    public abstract void seDeplacer();

    public String getNom() {
        return nom;
    }
}
