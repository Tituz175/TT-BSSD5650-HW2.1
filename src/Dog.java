public class Dog extends Animal {
    public Dog() {
        covering = "fur";
    }
    @Override
    public String speak() {
        return "barks";
    }
    @Override
    public String eat() {
        return "ate some kibble";
    }
}
