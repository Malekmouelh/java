public class Dolphin extends Aquatic {
    protected float swimmingSpeed;
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat ,float speed) {
        super(family,name,age,isMammal,habitat);
        this.swimmingSpeed = speed;

    }
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Speed: " + swimmingSpeed;
    }
    @Override
    public void swim(){
        System.out.println("this dolphin is swimming\n");
    }

}