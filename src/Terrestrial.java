public class Terrestrial extends Animal {
    protected int nbrLegs;
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        this.setFamily(family);
        this.setName(name);
        this.setAge(age);
        this.setMammal(isMammal);
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "nbrlegs: " + nbrLegs;
    }
}