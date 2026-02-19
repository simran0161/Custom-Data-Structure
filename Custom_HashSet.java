import java.util.*;

public class Custom_HashSet {

    // Without Hashing Collision
    private HashMap<Object, Object> hashset;
    private static final Object PRESENT = new Object();

    public Custom_HashSet() {
        hashset = new HashMap<>();
    }

    public void add(Object data) {
        hashset.put(data, PRESENT);
    }

    public boolean contains(Object data) {
        return hashset.containsKey(data);
    }

    public void remove(Object data) {
        hashset.remove(data);
    }

    public int size() {
        return hashset.size();
    }

    public static void main(String[] args) {
        Custom_HashSet set = new Custom_HashSet();
        set.add("Rahul");
        set.add("Amit");
        set.add("Neha");
        System.out.println(set.contains("Rahul")); 
        set.remove("Rahul");
        System.out.println(set.contains("Rahul"));

        
    }
}
