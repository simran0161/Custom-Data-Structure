import java.util.*;

public class hashset<T extends Comparable<T>> {

    private HashMap<Integer, TreeSet<T>> hashset;
    private int size;

    public hashset() {
        hashset = new HashMap<>();
        size = 20;
    }

    public void add(T data) {
        int hashcode = data.hashCode();
        int index = Math.abs(hashcode) % size;

        if (!hashset.containsKey(index)) {
            hashset.put(index, new TreeSet<>());
            hashset.get(index).add(data);
        } else {
            hashset.get(index).add(data);
        }

        System.out.println("Element get inserted "+ data);
    }

    public void contains(T data) {
        int hashcode = data.hashCode();
        int index = Math.abs(hashcode % size);
        if (hashset.containsKey(index)) {
            if (hashset.get(index).contains(data)) {
                System.out.println("Element " + data + " is present in the hashset");
            } else {
                System.out.println("Element " + data + " is not present in the hashset");
            }
        } else {
            System.out.println("Element " + data + " is not present in the hashset");
        }
    }

    public void remove(T data) {
        int hashcode = data.hashCode();
        int index = Math.abs(hashcode % size);
        if (hashset.containsKey(index)) {
            if (hashset.get(index).contains(data)) {
                hashset.get(index).remove(data);
                System.out.println("Element " + data + " is removed.");
            }
        } else {
            System.out.println("Element " + data + " is not present in the hashset");
        }
    }

}
