package Lesson2;

public class Main {
    public static void main(String[] args) {
        Cat cat =new Cat();
        cat.age = 5;
        cat.name ="soda";

        System.out.println(cat);

        System.out.println(cat.age);
        System.out.println(cat.name);

        cat.run();

    }
}
