package appli;


import zoo.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class GestionZoo {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Enclos> enclosList = new ArrayList<>();
    private static List<Visiteur> visiteurs = new ArrayList<>();


    public static void main(String[] args) {
        Enclos enclosLion = new Enclos("Savane", 3);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Menu Gestion Zoo ---");
            System.out.println("1. Ajouter un animal");
            System.out.println("2. Supprimer un animal");
            System.out.println("3. Nettoyer un enclos");
            System.out.println("4. Ajouter un soigneur");
            System.out.println("5. Ajouter un visiteur");
            System.out.println("6. || - Spectacle Sonore - || ");
            System.out.println("7. || - Spectacle Visuel - || ");
            System.out.println("8. Diagnostiqué les animaux");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> ajouterAnimal();
                case 2 -> supprimerAnimal();
                case 3 -> nettoyerEnclos();
                case 4 -> ajouterSoigneur();
                case 5 -> ajouterVisiteur();
                case 6 -> spectacleSonore();
                case 7 -> spectacleVisuel();
                case 8 -> diagnostiquer();
                case 0 -> {
                    running = false;
                    System.out.println("Fermeture du programme.");
                }
                default -> System.out.println("Choix invalide.");
            }
        }
    }
    private static void spectacleSonore(){
        Lion.faireDuBruit1();
        Oiseau.faireDuBruit2();
        Serpent.faireDuBruit3();
        Visiteur.interagir(visiteurs);
    }
    private static void diagnostiquer(){
        Soigneur.diagnostiquer();
    }

    private static void spectacleVisuel(){
        Lion.seDeplacer1();
        Oiseau.seDeplacer2();
        Serpent.seDeplacer3();
        Visiteur.interagir(visiteurs);
    }

    private static void nettoyerEnclos() {
       Enclos.nettoyerEnclos();
    }

    private static void ajouterSoigneur() {
        Soigneur.ajouterSoigneur();
    }

    private static void ajouterVisiteur() {
        Visiteur.ajouterVisiteur();
    }

    private static void ajouterAnimal() {
        Enclos.ajouterAnimal();
    }
    private static void supprimerAnimal() {
        Animal.supprimerAnimal();
    }

}
