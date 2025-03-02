import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionZoo {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Enclos> enclosList = new ArrayList<>();
    private static List<Soigneur> soigneurs = new ArrayList<>();
    private static List<Visiteur> visiteurs = new ArrayList<>();

    public static void main(String[] args) {
        Enclos enclosLion = new Enclos("Savane", 3);
        enclosList.add(enclosLion);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Menu Gestion Zoo ---");
            System.out.println("1. Ajouter un animal");
            System.out.println("2. Supprimer un animal");
            System.out.println("3. Nettoyer un enclos");
            System.out.println("4. Ajouter un soigneur");
            System.out.println("5. Ajouter un visiteur");
            System.out.println("6. Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1 -> ajouterAnimal();
                case 2 -> supprimerAnimal();
                case 3 -> nettoyerEnclos();
                case 4 -> ajouterSoigneur();
                case 5 -> ajouterVisiteur();
                case 6 -> {
                    running = false;
                    System.out.println("Fermeture du programme.");
                }
                default -> System.out.println("Choix invalide.");
            }
        }
    }

    private static void nettoyerEnclos() {
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

    private static void ajouterSoigneur() {
        System.out.print("Nom du soigneur : ");
        String nom = scanner.nextLine();
        System.out.print("Spécialité (Lion/Oiseau/Serpent) : ");
        String specialite = scanner.nextLine();
        soigneurs.add(new Soigneur(nom, specialite));
        System.out.println("Soigneur ajouté avec succès.");
    }

    private static void ajouterVisiteur() {
        System.out.print("Nom du visiteur : ");
        String nom = scanner.nextLine();
        System.out.print("Âge du visiteur : ");
        int age = scanner.nextInt();
        visiteurs.add(new Visiteur(nom, age));
        System.out.println("Visiteur ajouté avec succès.");
    }

    private static void ajouterAnimal() {
        System.out.print("Nom de l'animal : ");
        String nom = scanner.nextLine();
        System.out.print("Type (Lion/Oiseau/Serpent) : ");
        String type = scanner.nextLine();
        System.out.print("Âge de l'animal : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("L'animal a était ajouté avec succès.");
    }
    private static void supprimerAnimal() {
        System.out.print("Nom de l'animal à supprimer : ");
        String nomAnimal = scanner.nextLine();
        enclosList.get(0).supprimerAnimal(nomAnimal);
    }

}
