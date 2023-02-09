public class Cat extends Animal{
   private int age;

    public Cat(String name, int weight, int age) {
        super(name, weight);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +super.toString()+
                "age=" + age +
                '}';
    }
}
