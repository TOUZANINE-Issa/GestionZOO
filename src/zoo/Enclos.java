package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Enclos {
    private String nom;
    private static int capacite;
    private int proprete;
    public static List<Animal> animaux;

    private static Scanner scanner = new Scanner(System.in);
    private static List<Enclos> enclosList = new ArrayList<>();

    public Enclos(String nom, int capacite) {
        this.nom = nom;
        this.capacite = capacite;
        this.proprete = 100;
        this.animaux = new ArrayList<>();
    }

    public static void ajouterAnimal() {
        System.out.print("Nom de l'animal : ");
        String nom = scanner.nextLine();
        System.out.print("Type (Lion/Oiseau/Serpent) : ");
        String type = scanner.nextLine();
        System.out.print("Âge de l'animal : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (animaux.size() < capacite) {
            System.out.println(" l'animal a été ajouté à l'enclos ");
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

    public static void nettoyerEnclos() {
        System.out.println("Liste des enclos :");
        for (int i = 0; i < enclosList.size(); i++) {
            System.out.println((i + 1) + ". " + enclosList.get(i).getNom());
        }
        System.out.print("Sélectionnez l'enclos à nettoyer : ");
        int choix = scanner.nextInt();
        if (choix > 0 && choix <= enclosList.size()) {
            enclosList.get(choix - 1).nettoyer();
        } else {
            System.out.println("Choix invalide.");
        }
    }
}
