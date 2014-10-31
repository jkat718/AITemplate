package AITemplate;

public class ArrayNode extends Node {

    public ArrayNode(Object[] state, Node parentNode, Action parentAction, int cost) {
        super(parentNode, parentAction, cost);
        this.state = state;
    }

    /**
     *
     * @return state
     */
    public Object[] getState() {
        return state;
    }
    /**
     * The state that this node represents
     *
     */
    private final Object[] state;
}
