import java.util.ArrayList;

public class Tree extends Multiset {

    private Integer root;
    private ArrayList<Tree> subtrees;

    public Tree(int root) {
        this.root = root;
        this.subtrees = new ArrayList<Tree>();
    }

    public Tree(int root, ArrayList<Tree> subtrees) {
        this.root = root;
        this.subtrees = subtrees;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int __len__() {
        if (this.isEmpty()) {
            return 0;
        } else {
            int size = 1;
            for (Tree subtree : this.subtrees) {
                size += subtree.__len__();
            }
            return size;
        }
    }

    public String __str__() {
        return this.strIndented(0);
    }

    public String strIndented(int depth) {
        if (this.isEmpty()) {
            return "";
    }
}


