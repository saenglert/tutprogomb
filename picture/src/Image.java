
public class Image {

    public static void main(String[] args) {
        int[][] picture = Picture.load("/home/sascha/IdeaProjects/tutprogomb/picture/img/myPicture.jpeg");

        try {
            //addRectangle(picture,30, 70 ,220, 110);
            //flipImageHorizontal(picture);
            //addCircle(picture,150,150,100);
            //flipVerticalinCircel(picture,150,150,100);
            shiftOnX(picture, 180);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addRectangle(int[][] _picture, int _x, int _y, int _width, int _height) throws Exception {
        if(!checkCoordinates(_picture, _x, _y)) throw new Exception("Invalid Input");

        for (int x = _x; x < _width + _x; x++) {
            if (x >= _picture.length) continue;
            for (int y = _y; y < _height + _y; y++) {
                if( y >= _picture[0].length) continue;
                _picture[x][y] = 0;
            }
        }

        Picture.show(_picture);
    }

    public static void flipImageHorizontal(int[][] _picture) {
        int temp;

        for (int y = 0; y < _picture[0].length; y++) {
            for (int x = 0; x < _picture.length / 2; x++) {
                temp = _picture[(_picture.length - 1) - x][y];
                _picture[(_picture.length - 1) - x][y] = _picture[x][y];
                _picture[x][y] = temp;
            }
        }

        Picture.show(_picture);
    }

    public static void flipImageVertical(int[][] _picture) {
        for (int x = 0; x < _picture.length; x++) {
            for (int y = 0; y < _picture[0].length / 2; y++) {
                flipPointVertical(_picture,x,y, _picture.length/2, _picture[0].length /2);
            }
        }

        Picture.show(_picture);
    }

    public static void addCircle(int[][] _picture, int _x, int _y, int _radius) throws Exception{
        if(!checkCoordinates(_picture, _x,_y)) throw new Exception("Invalid Input");

        for (int x = 0; x < _radius + _x; x++) {
            for (int y = 0; y < _radius + _y; y++) {
                if (distance(x,y,_x,_y) <= _radius) _picture[x][y] = 0;
            }
        }

        Picture.show(_picture);
    }

    public static void flipVerticalinCircel(int[][] _picture, int _x, int _y, int _radius) throws Exception {
        if (!checkCoordinates(_picture,_x,_y)) throw new Exception("Invalid Input");

        for (int x = _x - _radius; x <= _x + _radius; x++) {
            for (int y = _y - _radius; y <= _y; y++) {
                if (distance(_x, _y, x, y) <= _radius) {
                    flipPointVertical(_picture, _x, _y, x, y);
                }
            }
        }

        Picture.show(_picture);
    }

    public static void shiftOnX(int[][] _picture, int _v) {
        int[][] temp = new int[_picture.length][_picture[0].length];
        for(int i = 0; i < temp.length; i++) {
            System.arraycopy(_picture[i], 0, temp[i], 0, temp[0].length);
        }


        for(int x = 0; x < _picture.length; x++) {
            for (int y = 0; y < _picture[0].length; y++) {
                int temp_x = x + _v;
                if(temp_x >= _picture.length) {
                    temp_x = temp_x - _picture.length;
                }

                _picture[x][y] = temp[temp_x][y];
            }
        }

        Picture.show(_picture);
    }

    public static void flipPointVertical(int[][] _picture, int _axis_x, int _axis_y, int _x, int _y) {
        int temp = _picture[_x][_y];

        int d = _axis_y - _y;

        _picture[_x][_y] = _picture[_x][_axis_y + d];
        _picture[_x][_axis_y + d] = temp;
    }

    public static double distance(int _p1x, int _p1y, int _p2x, int _p2y) {
        return Math.sqrt(Math.pow((double) (_p2x - _p1x), 2.0) + Math.pow((double) (_p2y - _p1y), 2.0 ));
    }

    public static boolean checkCoordinates(int[][] _picture, int _x, int _y) {
        int width = _picture.length;
        int height = _picture[0].length;

        return ( _x >= 0 && _x < width ) && (_y >= 0 && _y < height);
    }
}
