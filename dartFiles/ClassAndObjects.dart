class Subject {
  String? name;

  Subject(String name){
    this.name = name;
  }
  // void display() {
  //   print("Name: $name.");
  // }
}

class SubjectClassTest {
  void main() {
    Subject subject = Subject("Visual Programming");
    Subject subject2 = Subject("Web Development");
    print("Name: ${subject.name}.");
    print("Name: ${subject2.name}.");
  }
}