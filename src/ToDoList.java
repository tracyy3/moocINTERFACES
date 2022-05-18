import java.util.ArrayList;

// TO-DO-LIST (PART 1)
public class ToDoList {
    private ArrayList<String> list = new ArrayList<>();

    public ToDoList() {
        this.list = new ArrayList<>();
    }

    public static void main(String[] args) throws Exception {
        ToDoList list = new ToDoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");
        list.print();
        list.remove(2);
        list.print();
        list.add("buy raisins");
        list.print();
        list.remove(1);
        list.remove(1);
        list.print();
    }

    public void add(String item) {
        this.list.add(item);
    }

    public void print() {
        int count = 1;
        for (int index = 0; index < this.list.size(); index++) {
            System.out.println(count + ": "
                    + this.list.get(index));
            count++;
        }
    }

    public void remove(int number) {
        number -= 1;
        this.list.remove(number);
    }
}