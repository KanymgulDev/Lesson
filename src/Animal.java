public class Animal {
    private String name;
    private int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eating(){
        System.out.println(name+" is eating!");
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", weight=" + weight+", ";
    }
}
