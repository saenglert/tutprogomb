public class ShortestWay {
    public static int calc(int _x, int _y) {
        if(_x == 1 && _y == 1) {
            return 2;
        } else if(_x == 1) {
            return _y + 1;
        } else if (_y == 1) {
            return _x + 1;
        } else {
            return calc(_x - 1, _y) + calc(_x, _y - 1);
        } // end else
    } // end method
} // end class
