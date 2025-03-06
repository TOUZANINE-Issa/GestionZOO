package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Visiteur {
    protected static String nom;
    private int age;
    private static Scanner scanner = new Scanner(System.in);
    private static List<Visiteur> visiteurs = new ArrayList<>();

    public Visiteur(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public static void interagir(List<Visiteur> animal) {
        System.out.println(nom + " regarde  et s'émerveille !");

    }

    public static void ajouterVisiteur() {
        System.out.print("Nom du visiteur : ");
        String nom = scanner.nextLine();
        System.out.print("Âge du visiteur : ");
        int age = scanner.nextInt();
        visiteurs.add(new Visiteur(nom, age));
        System.out.println("Visiteur ajouté avec succès.");
    }
}
