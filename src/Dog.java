public class Dog  extends Animal{

    private String colour;

    static  void method(){
        System.out.println("");
    }
    public Dog(String name, int weight, String colour) {
        super(name, weight);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Dog{" +super.toString()+
                "colour='" + colour + '\'' +
                '}';
    }
}
