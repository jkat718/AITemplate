package AITemplate;

public class ObjectNode extends Node {

    public ObjectNode(Object state, Node parentNode, Action parentAction, int cost) {
        super(parentNode, parentAction, cost);
        this.state = state;
    }

    /**
     *
     * @return state
     */
    public Object getState() {
        return state;
    }
    /**
     * The state that this node represents
     *
     */
    private final Object state;
}
