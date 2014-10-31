package AITemplate;

public abstract class Node {

    private Node parentNode;
    private Action parentAction;
    private int cost;

    public Node(Node parentNode, Action parentAction, int cost) {
        this.parentNode = parentNode;
        this.parentAction = parentAction;
        this.cost = cost;
    }

    /**
     * Get the value of parentNode
     *
     * @return the value of parentNode
     */
    public Node getParentNode() {
        return parentNode;
    }

    /**
     * Set the value of parentNode
     *
     * @param parentNode new value of parentNode
     */
    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }

    /**
     * Get the value of parentAction
     *
     * @return the value of parentAction
     */
    public Action getParentAction() {
        return parentAction;
    }

    /**
     * Set the value of parentAction
     *
     * @param parentAction new value of parentAction
     */
    public void setParentAction(Action parentAction) {
        this.parentAction = parentAction;
    }

    /**
     * Get the value of cost
     *
     * @return the value of cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * Set the value of cost
     *
     * @param cost new value of cost
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
}
