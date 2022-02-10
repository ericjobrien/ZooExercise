package zoo;

public class Animal {

    String species;
    int temp = 0;

    public Animal() {

    }

    public Animal(String species) {
        this.species = species;
    }


    public int compareTo(Animal a) {


        return a.species.compareTo(this.species);
    }

}
