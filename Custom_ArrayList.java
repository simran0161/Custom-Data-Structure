import java.util.*;

public class Custom_ArrayList<T> {
    private LinkedList<T>[] arr;
    private int N;

    public Custom_ArrayList() {
        N = 50;
        arr = (LinkedList<T>[]) new LinkedList[N];
    }

    public void add(T data) {
        int hashcode = data.hashCode();
        int key = Math.abs(hashcode % N);

        if (arr[key] == null) {
            arr[key] = new LinkedList<>();
            arr[key].add(data);
        } else {
            for (T ele : arr[key]) {
                if (ele.equals(data)) {
                    System.out.println("Element " + data + " is already present in the list");
                    return;
                }
            }
            arr[key].add(data);
        }
        System.out.println("Element " + data + " is inserted in the list");
    }

    public void contains(T data) {
        int hashcode = data.hashCode();
        int key = Math.abs(hashcode % N);

        if (arr[key] != null) {
            for (T ele : arr[key]) {
                if (ele.equals(data)) {
                    System.out.println("Element " + data + " is present in the list");
                    return;
                }
            }
        }
        System.out.println("Element " + data + " is not present in the list");
    }

    public void remove(T data) {
        int hashcode = data.hashCode();
        int key = Math.abs(hashcode % N);
        if (arr[key] != null) {
            for (T ele : arr[key]) {
                if (ele.equals(data)) {
                    arr[key].remove(ele);
                    System.out.println("Element " + data + " is removed from the list");
                    return;
                }
            }
        }
    }

}
