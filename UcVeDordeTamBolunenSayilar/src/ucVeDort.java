import java.util.Scanner;

public class ucVeDort {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int sayi;
       int toplam= 0,sayac=0;
       System.out.println("Bir sayi girin : ");
       sayi = input.nextInt();
       for(int i=0;i<sayi;i++){
           if(i%3==0 && i%4==0){
               toplam=toplam+i;
               sayac+=1;
           }
       }
       System.out.println(toplam);
       System.out.println("Ortalama : "+(toplam/sayac));
    }
}
