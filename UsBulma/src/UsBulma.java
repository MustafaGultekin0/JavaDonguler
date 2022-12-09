import java.util.Scanner;

public class UsBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,us,sonuc=1;
        System.out.print("Bir sayi girin : ");
        sayi=input.nextInt();
        System.out.print("Us girin : ");
        us=input.nextInt();

        for (int i=0;i<us;i++){
            sonuc *= sayi;
        }
        System.out.println(sayi + " Ussu "+us+"="+sonuc);
    }
}
