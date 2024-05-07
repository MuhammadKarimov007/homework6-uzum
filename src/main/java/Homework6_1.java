import java.util.List;

public class Homework6_1 {

    public static class Node {
        public int val;
        public List<Node> children;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

    public int maxDepth(Node root) {
        if (root == null) {
            throw  new IllegalArgumentException();
        }

        if (root.children == null || root.children.isEmpty()) {
            return 1;
        }

        int maxChildDepth = 0;
        for (Node child : root.children) {
            maxChildDepth = Math.max(maxChildDepth, maxDepth(child));
        }

        return maxChildDepth + 1;
    }
}
