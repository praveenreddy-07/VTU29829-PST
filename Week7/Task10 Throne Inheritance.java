import java.util.*;

class ThroneInheritance {

    String king;
    HashMap<String, List<String>> children;
    HashSet<String> dead;

    public ThroneInheritance(String kingName) {
        king = kingName;
        children = new HashMap<>();
        dead = new HashSet<>();
    }

    public void birth(String parentName, String childName) {

        children.putIfAbsent(parentName, new ArrayList<>());

        children.get(parentName).add(childName);
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getInheritanceOrder() {

        List<String> result = new ArrayList<>();

        dfs(king, result);

        return result;
    }

    private void dfs(String name, List<String> result) {

        if (!dead.contains(name)) {
            result.add(name);
        }

        if (children.containsKey(name)) {

            for (String child : children.get(name)) {
                dfs(child, result);
            }
        }
    }
}
