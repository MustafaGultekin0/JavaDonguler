import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1,s2,temp;
        int ebob = 0,ekok;
        System.out.print("Birinci sayiyi girin : ");
        s1=input.nextInt();
        System.out.print("Ikinci sayiyi girin : ");
        s2=input.nextInt();
        if (s1>s2){
            temp=s1;
            s1=s2;
            s2=temp;
            temp=s1;
            while (temp>0){
                if(s1%temp==0 && s2%temp==0) {
                    ebob = temp;
                    break;
                }else {
                    temp--;
                }
            }
            ekok = (s1*s2)/ebob;
            System.out.println(ebob);
            System.out.println(ekok);

        }else {
            temp = s1;
            while (temp>0){
                if(s1%temp==0 && s2%temp==0) {
                    ebob = temp;
                    break;
                }else {
                    temp--;
                }
            }
            ekok = (s1*s2)/ebob;
            System.out.println(ebob);
            System.out.println(ekok);
        }

    }
}
