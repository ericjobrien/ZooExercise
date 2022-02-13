package zoo;


import org.apache.log4j.Logger;

public class Driver {

    public static Logger log = Logger.getLogger(Driver.class);

    public static void main(String[] args) {
        Driver.log.info("Hello there!");
        Driver.log.info("dog".compareTo("cat"));

        AnimalTree tree = new AnimalTree();
        Animal a1 = null;
        Animal a2 = null;
        Animal a3 = null;
        Animal a4 = null;
        Animal a5 = null;

            a1 = new Animal("giraffe");
            a2 = new Animal("lion");
            a3 = new Animal("shark");
            a4 = new Animal("giraffe");


//        try {
//            a5 = new Animal("Bigfoot");
//        } catch(FakeAnimalException e) {
//
//        }

        tree.add(a1);
        tree.add(a2);
        tree.add(a3);
        tree.add(a4);
//        tree.add(a5);

    }



}
