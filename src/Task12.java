public class Task12 {

    public static void main(String[] args) {
        printBytes(25l);
        printBytes(4628l);
        printBytes(1024l);
        printBytes(2884843l);
        printBytes(73658734710l);
        printBytes(53692044905543l);
    }

    static void printBytes(long a){
        int x = 0;
        long a1 = a;
        while (a1 / 1024 > 0) {
            a1 = a1 / 1024;
            x++;
        }
        if (x == 0)
            System.out.println(String.format("%.1f", (float)a) + " B");
        if (x == 1)
            System.out.println(String.format("%.1f", (float)a/1024) + " KB");
        if (x == 2)
            System.out.println(String.format("%.1f", (float)a/Math.pow(1024, 2)) + " MB");
        if (x == 3)
            System.out.println(String.format("%.1f", (float)a/Math.pow(1024, 3)) + " GB");
        if (x == 4)
            System.out.println(String.format("%.1f", (float)a/Math.pow(1024, 4)) + " TB");

    }
}
