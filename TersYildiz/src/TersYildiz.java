import java.util.Scanner;

public class TersYildiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamak,temp;
        System.out.print("Kac basamakli olsun : ");
        basamak = input.nextInt();
        temp = basamak;
        for (int i=0;i<basamak;i++){
            for (int j=0;j<=i-1;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=(2*temp)-1;k++){
                System.out.print("*");
            }
            temp--;
            System.out.println();
        }
    }
}
