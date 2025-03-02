class Oiseau extends Animal {
    public Oiseau(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " chante !");
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom + " vole dans le ciel.");
    }
}