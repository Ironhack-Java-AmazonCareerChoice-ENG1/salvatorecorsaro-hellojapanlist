import java.util.ArrayList;

public class LimitedArray {

    private ArrayList<String> list;
    private final int MAXIMUM_SIZE = 42;

    public LimitedArray() {
        this.list = new ArrayList<>();
    }

    public boolean add(String toAdd){
        if (list.size() < MAXIMUM_SIZE) {
            list.add(toAdd);
            return true;
        } else {
            return false;
        }
    }
}
