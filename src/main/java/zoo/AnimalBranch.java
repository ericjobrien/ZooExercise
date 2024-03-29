package zoo;

public class AnimalBranch {

    private Animal animal;
    AnimalBranch left;
    AnimalBranch right;

    public AnimalBranch() {

    }

    public AnimalBranch(Animal a) {
        this.animal = a;
    }

    public int compareTo(AnimalBranch a) {

        return animal.species.compareTo(a.animal.species);
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public AnimalBranch getLeft() {
        return left;
    }

    public void setLeft(AnimalBranch left) {
        this.left = left;
    }

    public AnimalBranch getRight() {
        return right;
    }

    public void setRight(AnimalBranch right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return animal.toString();
    }
}
