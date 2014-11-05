package AITemplate;

public class Action {

    /**
     *
     *
     */
    public Action() {
    }

    /**
     * Generates and returns a new Node, using given algorithm
     *
     * @param parentNode
     * @return
     * @Overridable
     */
    public Node run(Node parentNode) {
        throw new UnsupportedOperationException("run() is not defined for " + this + "!");
    }
}
