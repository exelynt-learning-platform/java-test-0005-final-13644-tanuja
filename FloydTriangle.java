public class FloydTriangle {

    private static final int ROWS = 5;

    public static void main(String[] args) {

        int count = 1;

        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + (j < i ? " " : ""));
                count++;
            }
            System.out.println();
        }
    }
}
