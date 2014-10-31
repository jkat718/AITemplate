package AITemplate;

import java.util.ArrayList;

public class ArrayListNode extends Node {

    public ArrayListNode(ArrayList<Object> state, Node parentNode, Action parentAction, int cost) {
        super(parentNode, parentAction, cost);
        this.state = state;
    }

    /**
     *
     * @return state
     */
    public ArrayList<Object> getState() {
        return state;
    }
    /**
     * The state that this node represents
     *
     */
    private final ArrayList<Object> state;
}
