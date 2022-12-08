import java.util.Scanner;

public class CiftVeDordunKatlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,toplam=0;
        boolean isCorrect= true;
        while(isCorrect){
            System.out.println("Bir sayi girin : ");
            sayi=input.nextInt();
            if(sayi%2==0 && sayi%4==0){
                toplam=toplam+sayi;
            }else if (sayi%2==1){
                isCorrect=false;
            }
        }
        System.out.println("toplam : "+ toplam);
    }
}
