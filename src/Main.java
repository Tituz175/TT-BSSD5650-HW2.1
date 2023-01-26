public class Main {
    public static void main(String[] args) {
        Animal duck = new Duck();
        Animal dog = new Dog();
        Animal turtle = new Turtle();
        careFor(duck);
        careFor(dog);
        careFor(turtle);
    }
    public static void careFor(Animal animal){
        System.out.println(animal.speak());
        System.out.println(animal.eat());
        System.out.println(animal.pet());
    }
}