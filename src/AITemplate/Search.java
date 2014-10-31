package AITemplate;

import java.util.ArrayList;

public class Search {

    private ArrayList<Node> frontierList;

    public ArrayList<Action> BFS(Node originNode) {
        frontierList.add(originNode);
        for (Node node : frontierList) {
            if (findWinner(node)) {
                return findPath(node);
            } else {
                frontierList.addAll(genStates(node));
            }
        }
        return null;
    }

    private ArrayList<Node> genStates(Node node) {
        return null;
    }

    private boolean findWinner(Node node) {
        return true;
    }

    private ArrayList<Action> findPath(Node winNode) {
        return null;
    }
}
