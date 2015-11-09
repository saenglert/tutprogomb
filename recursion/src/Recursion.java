
public class Recursion {
    public static void main(String[] args) {
        System.out.println("Hello World");

        recursion(8);

        //System.out.println(shortestWays(3,4));


    }

    private static void recursion(int _i) {
        String leer = "";
        for(int counter = 0; counter < (8 - _i); counter++) leer += "    ";
        System.out.println(leer + "recursion( " + _i + " ) start");

        if(_i == 0) {
            System.out.println(leer + "i = 0! Recursion ends here");
        }
        else {
            recursion(_i - 1);

        }

        System.out.println(leer + "recursion( " + _i + " ) end");
    }

    public static int shortestWays(int _x, int _y) {
        if(_x == 1 && _y == 1) {
            return 2;
        } else if(_x == 1) {
            return _y + 1;
        } else if(_y == 1) {
            return _x + 1;
        } else {
            return shortestWays(_x - 1, _y) + shortestWays(_x, _y - 1);
        }
    }
}
