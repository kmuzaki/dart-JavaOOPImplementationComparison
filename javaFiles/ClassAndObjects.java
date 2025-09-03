package javaFiles;

public class ClassAndObjects {
    String name;

    public ClassAndObjects(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
            ClassAndObjects class1 = new ClassAndObjects("Visual Programming");
            ClassAndObjects class2 = new ClassAndObjects("Web Development");
            System.out.println("Class name: " + class1.name);
            System.out.println("Class name: " + class2.name);
    }
}

