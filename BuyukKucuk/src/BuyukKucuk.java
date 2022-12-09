import java.util.Scanner;

public class BuyukKucuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adet,s1,s2,temp,temp2;
        System.out.println("Kac adet sayi gireceksiniz : ");
        adet = input.nextInt();
        System.out.print("1.nci sayi : ");
        s1=input.nextInt();
        temp=s1;
        temp2=s1;
        for (int i=2;i<=adet;i++){
            System.out.print(i+".nci sayi : ");
            s2=input.nextInt();
            if (s2<s1){
                temp2=s2;
            }
            if (s2>s1){
                temp=s2;
            }

        }
        System.out.println("En kucuk sayi : " + temp2);
        System.out.println("En buyuk sayi : "+temp);
    }

}
