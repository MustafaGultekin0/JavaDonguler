import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam=0,top1=0,top2=1,temp;
        System.out.println("Bir sayi girin : ");
        sayi=input.nextInt();
        System.out.println(top1+"\n"+top2);
        for(int i=0;i<sayi;i++){
            toplam=top1+top2;
            System.out.println(toplam);
            temp=top2;
            top2=toplam;
            top1=temp;
        }
    }
}
