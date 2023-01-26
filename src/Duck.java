public class Duck extends Animal {
    public Duck() {
        covering = "feathers";
    }

    @Override
    public String speak() {
        return "quacks";
    }

    @Override
    public String eat() {
        return "ate some bread";
    }
}
