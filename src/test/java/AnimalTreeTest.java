import org.junit.Assert;
import org.junit.Test;  //sits in a hidden folder called m2 that resides on our local machine
import zoo.Animal;
import zoo.AnimalTree;

public class AnimalTreeTest {


    @Test
    void  ContainsAddedAnimal() {
        AnimalTree tree1 = new AnimalTree();
        Animal a1 = new Animal("Giraffe");
        tree1.add(a1);
         //need to build the contains method for the animal package before this works
    }

    //change version of Junit to utilze the BeforeAll test


}
