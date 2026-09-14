import java.util.*;

abstract class Tree {
    private int value;
    private int depth;

    public Tree(int value, int depth) {
        this.value = value;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

interface TreeVis {
    int getResult();
    void visitNode(TreeNode node);
    void visitLeaf(TreeLeaf leaf);
}

class TreeNode extends Tree {
    private List<Tree> children = new ArrayList<>();

    public TreeNode(int value, int depth) {
        super(value, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {
    public TreeLeaf(int value, int depth) {
        super(value, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}
