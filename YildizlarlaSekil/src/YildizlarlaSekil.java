import java.util.Scanner;

public class YildizlarlaSekil {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int bosluk,basamak,satir;
        System.out.print("Bir sayi girin : ");
        satir=input.nextInt();
        basamak=satir/2+1;
        for (int i=1;i<=basamak;i++){
            for (int k=1;k<=(basamak-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l=basamak-1;l>=1;l--){
            for (int m=1;m<=basamak-l;m++){
                System.out.print(" ");
            }
            for (int n=1;n<=(2*l)-1;n++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
