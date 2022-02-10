package zoo;

public class Driver {

    public static void main(String[] args) {
        System.out.println("Hello there!");
        System.out.println("dog".compareTo("cat"));

        AnimalTree tree = new AnimalTree();
        Animal a1 = new Animal("giraffe");
        Animal a2 = new Animal("lion");
        Animal a3 = new Animal("shark");
        Animal a4 = new Animal("giraffe");

        tree.add(a1);
        tree.add(a2);
        tree.add(a3);
        tree.add(a4);
    }



}
