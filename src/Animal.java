public abstract class Animal {
    private String name;
    private String generation;
    private int age;
    private Stable stable;

    Animal() {
        name = "Not set";
        generation = "not set";
        age = 0;
    }

    Animal(String name, String  generation) {
        this.name = name;
        this.generation = generation;
    }

    Animal(String name, String  generation, int age) {
        this.name = name;
        this.generation = generation;
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name is " + name + ", " + generation + " of his/her name, and I am " + age + ".";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getGeneration() {
        return generation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setStable(Stable stable) {
        this.stable = stable;
    }

    public Stable getStable() {
        return stable;
    }
}
