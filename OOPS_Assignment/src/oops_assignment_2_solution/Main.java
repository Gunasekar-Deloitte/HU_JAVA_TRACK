package oops_assignment_2_solution;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setCat("cat");
        animal.setDog("dog");
        animal.setLion("Lion");

        System.out.println(animal.getCat());
        System.out.println(animal.getDog());
        System.out.println(animal.getLion());
    }
}
