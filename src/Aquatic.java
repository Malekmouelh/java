public abstract class Aquatic extends Animal {

    protected String habitat;
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        this.setFamily(family);
        this.setName(name);
        this.setAge(age);
        this.setMammal(isMammal);
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Habitat: " + habitat;
    }
    public abstract void swim();
    @Override
    public boolean equals(Object o) {
        if (null == o) return false;
        if (o instanceof Aquatic aquatic) {
            return super.getName().equals(aquatic.getName()) && super.getAge()==aquatic.getAge() && this.habitat.equals(aquatic.habitat);
        }
        return false;
    }
}