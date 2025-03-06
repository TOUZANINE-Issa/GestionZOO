package zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Animal {
    protected static String nom;
    protected int age;
    private static Scanner scanner = new Scanner(System.in);
    private static List<Enclos> enclosList = new ArrayList<>();
    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public static void supprimerAnimal() {
        System.out.print("Nom de l'animal à supprimer : ");
        String nomAnimal = scanner.nextLine();
        enclosList.get(0).supprimerAnimal(nomAnimal);
    }

    public String getNom() {
        return nom;
    }
}
