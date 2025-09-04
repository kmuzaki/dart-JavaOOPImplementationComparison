class Subject {
  String? _name;
  String? _favouriteFood;

  Subject(String name, String favouriteFood) {
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