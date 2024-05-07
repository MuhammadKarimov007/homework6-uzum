import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class Homework6_1TestMyOwn {

    @Test
    public void testMaxDepthSingleNode() {
        Homework6_1 homework = new Homework6_1();
        Homework6_1.Node root = new Homework6_1.Node(1);
        assertEquals(1, homework.maxDepth(root));
    }

    @Test
    public void testMaxDepthNoChildren() {
        Homework6_1 homework = new Homework6_1();
        Homework6_1.Node root = new Homework6_1.Node(1);
        root.children = new ArrayList<>();
        assertEquals(1, homework.maxDepth(root));
    }

    @Test
    public void testMaxDepth() {
        Homework6_1 homework = new Homework6_1();

        Homework6_1.Node node1 = new Homework6_1.Node(1);
        Homework6_1.Node node2 = new Homework6_1.Node(2);
        Homework6_1.Node node3 = new Homework6_1.Node(3);
        Homework6_1.Node node4 = new Homework6_1.Node(4);
        Homework6_1.Node node5 = new Homework6_1.Node(5);

        List<Homework6_1.Node> childrenOfNode1 = new ArrayList<>();
        childrenOfNode1.add(node3);
        childrenOfNode1.add(node2);
        childrenOfNode1.add(node4);
        node1.children = childrenOfNode1;

        List<Homework6_1.Node> childrenOfNode3 = new ArrayList<>();
        childrenOfNode3.add(node5);
        node3.children = childrenOfNode3;



        int depth = homework.maxDepth(node1);
        assertEquals(3, depth);
    }
}
