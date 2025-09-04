class Person {
  String? _name;
  String? _favouriteFood;

  Person(String name, String favouriteFood) {
    this._name = name;
    this._favouriteFood = favouriteFood;
  }

  String getName() {
    return _name!;
  }

  String getFavouriteFood() {
    return _favouriteFood!;
  }

  void setName(String name) {
    this._name = name;
  }

  void setFavouriteFood(String favouriteFood) {
    this._favouriteFood = favouriteFood;
  }

}

void main() {
  Person person = Person("Gordon Freeman", "Pizza");
  print("Name: ${person.getName()}.");
  print("Favourite Food: ${person.getFavouriteFood()}.");

  person.setName("Arne Magnusson");
  person.setFavouriteFood("Microwaved Casserole");
  print("Updated Name: ${person.getName()}.");
  print("Updated Favourite Food: ${person.getFavouriteFood()}.");
}