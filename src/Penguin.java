public class Penguin extends Aquatic {
    protected float swimmingDepth;
    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float depth) {
        super(family,name,age,isMammal,habitat);
        this.swimmingDepth = depth;
    }
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "depth: " + swimmingDepth;
    }
    @Override
    public void swim(){
        System.out.println("this penguin is swimming\n");
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
}