import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        double sonuc=0;
        System.out.println("Bir sayi girin : ");
        sayi= input.nextInt();
        for (double i=1;i<=sayi;i++){
            sonuc += (1/i);
        }
        System.out.println(sonuc);
    }
}
