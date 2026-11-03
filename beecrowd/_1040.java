import java.io.IOException;
import java.util.Scanner;
 
@SuppressWarnings("ConvertToTryWithResources")
public class _1040 {
 
    public static void main(String[] args) throws IOException {
        float n1, n2, n3, n4, n5, media;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();
        
        media = (2*n1 + 3*n2 + 4*n3 + n4)/10;
        
        System.out.printf("Media: %.1f\n", media);
        if (media >= 7) 
            System.out.printf("Aluno aprovado.\n");
        else if (media < 5) 
            System.out.printf("Aluno reprovado.\n");
        else{
            System.out.printf("Aluno em exame.\n");
            n5 = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", n5);
            media = (media + n5)/2;
            if (media >= 5) 
                System.out.printf("Aluno aprovado.\n");
            else
                System.out.printf("Aluno reprovado.\n");
            System.out.printf("Media final: %.1f\n", media);
        } 
        sc.close();
    }
 
}