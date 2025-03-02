class Serpent extends Animal {
    public Serpent(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " siffle !");
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom + " rampe silencieusement.");
    }
}
