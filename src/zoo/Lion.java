package zoo;

class Lion extends Animal {
    public Lion(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom + " rugit !");
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom + " court majestueusement.");
    }
}