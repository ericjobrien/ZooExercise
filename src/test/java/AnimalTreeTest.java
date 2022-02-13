import org.junit.Assert;
import org.junit.jupiter.api.*;
import zoo.Animal;
import zoo.AnimalTree;
import zoo.FakeAnimalException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTreeTest {


    @Test
    void  ContainsAddedAnimal()  {
        AnimalTree tree1 = new AnimalTree();
        Animal a1 = new Animal("Giraffe");
        tree1.add(a1);

        assertTrue(tree1.contains(a1));

    }

}
