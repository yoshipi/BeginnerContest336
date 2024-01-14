import java.util.Optional;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Optional.ofNullable(sc).orElseThrow();

        int N = sc.nextInt();

        String binary = Integer.toBinaryString(N);
        StringBuilder stringBuilder = new StringBuilder(binary);
        stringBuilder.reverse();
        String reverseBinary = stringBuilder.toString();

        int count = 0;

        for (int i = 0; i < binary.length(); i++) {
            String str = reverseBinary.substring(i, i + 1);
            if (str.equalsIgnoreCase("0")) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
    }

}
