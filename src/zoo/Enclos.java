package zoo;

import java.util.ArrayList;
import java.util.List;

class Enclos {
    private String nom;
    private int capacite;
    private int proprete;
    private List<Animal> animaux;

    public Enclos(String nom, int capacite) {
        this.nom = nom;
        this.capacite = capacite;
        this.proprete = 100;
        this.animaux = new ArrayList<>();
    }

    public void ajouterAnimal(Animal animal) {
        if (animaux.size() < capacite) {
            animaux.add(animal);
            System.out.println(animal.getNom() + " a été ajouté à l'enclos " + nom);
        } else {
            System.out.println("L'enclos est plein !");
        }
    }

    public void supprimerAnimal(String nomAnimal) {
        animaux.removeIf(animal -> animal.getNom().equals(nomAnimal));
        System.out.println("Animal " + nomAnimal + " supprimé de l'enclos " + nom);
    }

    public void degraderProprete() {
        proprete -= 10;
        System.out.println("L'état de propreté de l'enclos " + nom + " est maintenant : " + proprete);
    }

    public void nettoyer() {
        proprete = 100;
        System.out.println("L'enclos " + nom + " a été nettoyé.");
    }

    public String getNom() {
        return nom;
    }
}
