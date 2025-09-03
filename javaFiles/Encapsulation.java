package javaFiles;

public class Encapsulation {
    private String name;
    private String favouriteFood;

    public Encapsulation(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation("Gordon Freeman", "Pizza");
        System.out.println("Name: " + person.getName());
        System.out.println("Favourite Food: " + person.getFavouriteFood());

        person.setName("Arne Magnusson");
        person.setFavouriteFood("Microwwaved Caserole");
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Favourite Food: " + person.getFavouriteFood());
    }
}
