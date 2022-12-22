import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1to3();
        task4();
    }

    public static void task1to3() {
        int[] a = new int[]{1, 2, 3};
        float[] b = {1.57f, 7.654f, 9.986f};
        long[] c = new long[]{4_000_000L, 2_000_000L, 3_000_000L};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < c.length; i++){
            if (i==c.length-1)  {
                System.out.println(c[i]);
                break;}
            System.out.print(c[i]+ ", ");
        }
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

    }


    public static void task4() {
        int[] a = new int[]{1, 2, 3};
        for (int i = 0; i <= a.length-1; i++) {
            boolean ii = a[i] % 2 == 0;
            if (!ii) {
                a[i] = a[i] + 1;
                System.out.print(a[i]);
                continue;
            }
        System.out.print(a[i]);
        }

    }
}