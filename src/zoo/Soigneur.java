package zoo;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Soigneur {
    private String nom;
    private String specialite;
    private static Scanner scanner = new Scanner(System.in);
    private static List<Soigneur> soigneurs = new ArrayList<>();
    public Soigneur(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;
    }

    public static void diagnostiquer() {
        boolean malade = Math.random() < 0.5;
        System.out.println(" examine et trouve " + (malade ? "un des animaux est malade" : "les animaux sont bonne santé"));
        if (malade) {
            String Lion = "Lion";
            String Serpent = "Serpent";
            String Oiseau = "Oiseau";
            String[] variant = {Lion, Serpent, Oiseau};
            Random random = new Random();
            int malades = random.nextInt(3);

            System.out.println("l'animal malade est : " + variant[malades]);
            System.out.println("Le Soigneur soigne "+variant[malades]);
        }
    }

    public void soigner(Animal animal) {
        System.out.println(nom + " soigne " + animal.getNom());
    }

    public static void ajouterSoigneur() {
        System.out.print("Nom du soigneur : ");
        String nom = scanner.nextLine();
        System.out.print("Spécialité (Lion/Oiseau/Serpent) : ");
        String specialite = scanner.nextLine();
        soigneurs.add(new Soigneur(nom, specialite));
        System.out.println("Soigneur ajouté avec succès.");
    }
}
