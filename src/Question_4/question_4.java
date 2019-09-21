package Question_4;
import java.util.*;

public class question_4 {


    public static void main(String[] args) {
        question_4 question_4 = new question_4();
        findMaxdistance();
    }


    public static double findMaxdistance() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Amount of points n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(4) + 1;
            b[i] = random.nextInt(5) + 1;
            System.out.println("Coordinate: " + i + "\t");
            System.out.println("a: " + a[i]);
            System.out.println("b: " + b[i]);
        }
        double ab = Math.sqrt(Math.sqrt(a[0] - a[1]) + Math.sqrt(b[0] - b[1]));
        int iab = 0;
        int jab = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.sqrt(Math.sqrt(a[i] - a[j]) + Math.sqrt(b[i] - b[j])) > ab) {
                    ab = Math.sqrt(Math.sqrt(a[i] - a[j]) + Math.sqrt(b[i] - b[j]));
                    iab = i;
                    jab = j;
                }
            }
        }
        System.out.println("Maximum distance between points: " + iab + "-" + jab + " = " + Math.rint((ab) * 100) / 100);
        return ab;
    }
}







