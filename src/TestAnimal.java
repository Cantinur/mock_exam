//• Implement a test class called TestAnimal. Write the beginning of the program through public static void main.
// In the test class create two different Animal objects (one Goat and one Lion) with a Stable only for the Goat.
// Use the different constructors to do that. Both goat and lion should print its toString. Call the feedAnimal of
// the Goat one time with a food he/she likes and one with food he/she does not like. Print both reactions
// of the goat. (6 points)

public class TestAnimal {

    public static void main(String[] args) {

        Lion simba = new Lion("Simba", "The second", 4);
        Goat billy = new Goat("Billy", "The first", 2, "grass");
        Stable stable = new Stable("Ekeberg parken", "Horsebox Nr. 5", "EKT");

        billy.setStable(stable);

        System.out.println(billy.toString());
        System.out.println(simba.toString());

        System.out.println(billy.feedAnimal("grass"));
        System.out.println(billy.feedAnimal("Human"));
    }
}