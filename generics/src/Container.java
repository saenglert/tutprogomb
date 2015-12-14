import java.util.Vector;

public class Container <L> {
    Vector<L> contents;

    Container() {
        this.contents = new Vector<>();
    }

    Container(Vector<L> vector) {
        this.contents = vector;
    }

    public void print() {
        for (L content : this.contents) {
            System.out.println(content + ", ");
        }
    }

    public static void main(String[] args) {
        Container<String> container = new Container<>();
        container.contents.add("Hallo");
        container.contents.add("Welt");
        container.contents.add("Wir");
        container.contents.add("Sind");
        container.contents.add("Toll");

        container.print();

    }
}
