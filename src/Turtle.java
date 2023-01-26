public class Turtle extends Animal implements IAnimal{
    public Turtle() {
        covering = "shell";
    }

    @Override
    public String speak() {
        return "biting";
    }

    @Override
    public String eat() {
        return "vegetables";
    }
}
