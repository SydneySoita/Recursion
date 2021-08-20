public class TriangleRows {
    public static int triangle(int num) {
        if (num == 0) {
            return num;

        } else {
            return num + triangle(num - 1);

        }
    }

}
