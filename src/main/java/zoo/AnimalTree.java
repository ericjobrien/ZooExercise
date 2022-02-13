package zoo;

public class AnimalTree {

    AnimalBranch head;

    public AnimalTree() {

    }

    public boolean add(Animal a) {

        //Deciding how to go left or right - left = -1, right = 1
        if(head == null) {
            head = new AnimalBranch(a);
            Driver.log.info("Head is set as: " + a.species);
        } else {
            AnimalBranch current = head;
            while(true) {
                if (current.getAnimal().compareTo(a) < 0) {
                    if (current.left == null) {
                        current.left = new AnimalBranch(a);
                        Driver.log.info("Adding to left: " + a.species);
                        return true;
                    } else {
                        current = current.left;
                    }
                } else if (current.getAnimal().compareTo(a) >= 0) {
                    if (current.right == null) {
                        current.right = new AnimalBranch(a);
                        Driver.log.info("Adding to right: " + a.species);
                        return true;
                    } else {
                        current = current.right;
                    }
                } else {
                    Driver.log.info("Species " + a.species + " already exists!");
                    return false;
                }
            }
        }


        return false;
    }

    public boolean contains(Animal a) {

        if(head == null) {
            Driver.log.info("Added as head: " + a);
            return false;
        } else {
            AnimalBranch current = head;
            while (true) {
                if(current.getAnimal().compareTo(a) < 0) {
                    if(current.left == null) {
                        return false;
                    } else {
                        current = current.left;
                    }
                } else if(current.getAnimal().compareTo(a) > 0) {
                    if(current.right == null) {
                        current.right = new AnimalBranch(a);
                        return false;
                    } else {
                        current = current.right;
                    }
                } else {
                    return true;
                }
            }
        }


    }
}


