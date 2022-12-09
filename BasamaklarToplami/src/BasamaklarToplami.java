import java.util.Scanner;

public class BasamaklarToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,tempNumber,total=0,count=0,result=0,basValue,basPow,tempNumber2;
        System.out.print("bir Sayi girin : ");
        number = input.nextInt();
        tempNumber2=number;
        while(tempNumber2!=0){
            total+=tempNumber2%10;
            tempNumber2/=10;
            count++;
        }
        System.out.println("Sayi " + count + " Basamakli");
        System.out.println("Toplam = " + total);

        for (tempNumber=1;tempNumber<1000;tempNumber++) {
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;
                for (int i = 0; i < count; i++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }
            if (result == number) {
                System.out.println(tempNumber + " bir armstrong sayidir . ");
            }

        }




    }
}
