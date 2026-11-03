import java.io.IOException;
import java.util.Scanner;

public class _1006 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        float n1, n2, n3, media;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        media = (2*n1+3*n2+5*n3)/10;
        System.out.printf("MEDIA = %.1f\n", media);
        sc.close();
    }
 
}