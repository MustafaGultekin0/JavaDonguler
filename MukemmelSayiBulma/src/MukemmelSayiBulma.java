import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,toplam=0;
        System.out.println("Bir sayi girin : ");
        sayi=input.nextInt();
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                toplam+=i;
            }
        }
        System.out.println(toplam);
        if(toplam==sayi){
            System.out.println(sayi+" bir mukemmel sayidir ");
        }else{
            System.out.println(sayi+" bir mukemmel sayi degildir ");
        }
    }
}
