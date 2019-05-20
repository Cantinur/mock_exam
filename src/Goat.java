public class Goat extends Animal implements Feedable {
    private String favoriteFood;

    public Goat() {
        super();
        favoriteFood = "not set";
    }

    public Goat(String name, String generation) {
        super(name, generation);
        favoriteFood = "not set";
    }

    public Goat(String name, String generation, int age) {
        super(name, generation, age);
        favoriteFood = "not set";
    }

    public Goat(String name, String generation, int age, String favoriteFood) {
        super(name, generation, age);
        this.favoriteFood = favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood){
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood(){
        return favoriteFood;
    }

    //@Override
    //public String feedAnimal(String food) { //Advanced edition
    //    return (favoriteFood.equals(food)) ? "This is good!" : "I dont like this...";
    //}

    @Override
    public String feedAnimal(String food) { //Simple edition
        if (favoriteFood.equals(food)) {
            return food + " is my favorite food!";
        } else {
            return "I dont like " + food + ". Do you have something else for me";
        }
    }

    @Override
    public String toString(){
        return super.toString() + " I am pleased if you feed me " + favoriteFood;
    }
}
