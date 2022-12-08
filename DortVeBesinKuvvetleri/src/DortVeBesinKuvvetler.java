import java.util.Scanner;

public class DortVeBesinKuvvetler {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.println("Bir sayi girin : ");
        sayi = input.nextInt();
        for(int i=4;i<sayi;i*=4){
                System.out.println(i);
        }
        for(int j=5;j<sayi;j*=5){
            System.out.println(j);
        }
    }
}
