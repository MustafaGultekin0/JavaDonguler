import java.util.Scanner;

public class KombinasyonBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,nFakt=1,rFakt=1,kombinasyon,neksrFakt;
        System.out.println("Bir n sayisi girin : ");
        n=input.nextInt();
        System.out.println("Bir r sayisi girin : ");
        r=input.nextInt();
        for (int i=n;i>0;i--){
            nFakt *= i;
        }
        for (int j=r;j>0;j--){
            rFakt*=j;
        }
        neksrFakt=n-r;
        for(int k=neksrFakt;k>0;k--){
            neksrFakt*=k;
        }
        kombinasyon = nFakt/(rFakt*neksrFakt);
        System.out.println(n + "'in"+r+"'li kombinasyonu : "+kombinasyon);
    }
}
