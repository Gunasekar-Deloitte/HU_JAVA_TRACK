package oops_assignment_2_solution;

public class Animal {
    private String dog;
    private String cat;
    private String lion;


    public Animal() {

    }

    public Animal(String dog, String cat, String lion) {
        this.dog = dog;
        this.cat = cat;
        this.lion = lion;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getLion() {
        return lion;
    }

    public void setLion(String lion) {
        this.lion = lion;
    }
}
