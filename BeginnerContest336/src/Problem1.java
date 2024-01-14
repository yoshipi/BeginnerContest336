import java.util.Optional;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        int N = sc.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("L");

        for (int i = 0; i < N; i++) {
            stringBuilder.append("o");
        }

        stringBuilder.append("n");
        stringBuilder.append("g");

        System.out.println(stringBuilder.toString());
    }
}
