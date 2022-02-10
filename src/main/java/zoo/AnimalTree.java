package zoo;

public class AnimalTree {

    AnimalBranch head;

    public AnimalTree() {

    }

    public boolean add(Animal a) {

        //Deciding how to go left or right - left = -1, right = 1
        if(head == null) {
            head = new AnimalBranch(a);
            System.out.println("Head is set as: " + a.species);
        } else {
            AnimalBranch current = head;
            while(true) {
                if (current.getAnimal().compareTo(a) <= -1) {
                    if (current.left == null) {
                        current.left = new AnimalBranch(a);
                        System.out.println("Adding to left: " + a.species);
                        return true;
                    } else {
                        current = current.left;
                    }
                } else if (current.getAnimal().compareTo(a) >= 1) {
                    if (current.right == null) {
                        current.right = new AnimalBranch(a);
                        System.out.println("Adding to right: " + a.species);
                        return true;
                    } else {
                        current = current.right;
                    }
                } else {
                    System.out.println("Species " + a.species + " already exists!");
                    return false;
                }
            }
        }


        return false;
    }
}


