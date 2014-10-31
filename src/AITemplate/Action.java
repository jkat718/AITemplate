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
     * @Overridable
     */
    public Node run(boolean isPlayer, Node parentNode) {
        throw new UnsupportedOperationException("run() is not defined for " + this + "!");
    }
}
