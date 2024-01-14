import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        Long N = Long.valueOf(sc.nextLine());
        if (N == 1) {
            System.out.println(0);
            return;
        }
        N--;

        String str = "";

        while (N > 0) {
            str = Long.toString(N % 5) + str;
            N /= 5;
        }

        System.out.println(Long.parseLong(str) * 2);
    }

}
