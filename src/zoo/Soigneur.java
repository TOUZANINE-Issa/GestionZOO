package zoo;

class Soigneur {
    private String nom;
    private String specialite;

    public Soigneur(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;
    }

    public void diagnostiquer(Animal animal) {
        boolean malade = Math.random() < 0.5;
        System.out.println(nom + " examine " + animal.getNom() + " et trouve qu'il est " + (malade ? "malade" : "en bonne santé"));
    }

    public void soigner(Animal animal) {
        System.out.println(nom + " soigne " + animal.getNom());
    }
}
