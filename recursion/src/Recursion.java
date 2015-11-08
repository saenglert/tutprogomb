
public class Recursion {
    public static void main(String[] args) {
        System.out.println("Hello World");
        recursion(8);
    }

    private static void recursion(int _i) {
        System.out.println("recursion( " + _i + " ) start");

        if(_i == 0) {
            System.out.println("i = 0! Recursion ends here");
        }
        else {
            recursion(_i - 1);

        }

        System.out.println("recursion( " + _i + " ) end");
    }
}
