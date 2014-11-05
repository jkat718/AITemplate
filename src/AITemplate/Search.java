package AITemplate;

import java.util.ArrayList;

public class Search {

    private ArrayList<Node> frontierList;

    public ArrayList<Action> BFS(Node originNode, ArrayList<Action> agentActions) {
        frontierList.add(originNode);
        for (Node parent : frontierList) {
            for (Node child : genStates(parent, agentActions)) {
                if (isWinState(child)) {
                    return findPath(child);
                } else {
                    frontierList.add(child);
                }
            }
        }
        return null;
    }

    private ArrayList<Node> genStates(Node parent, ArrayList<Action> agentActions) {
        ArrayList<Node> returnArrayList = new ArrayList<>();
        for (Action action : agentActions) {
            returnArrayList.add(action.run(parent));
        }
        return returnArrayList;
    }

    private boolean isWinState(Node node) {
        return true;
    }

    private ArrayList<Action> findPath(Node winNode) {
        return null;
    }
}
