import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Double a=2.14,e=3.67,d=1.11,m=0.95,p=5.0,sum;

        Scanner scan=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo: ");
        a*=scan.nextDouble();
        System.out.print("Elma Kaç Kilo: ");
        e*=scan.nextDouble();
        System.out.print("Domates Kaç Kilo: ");
        d*=scan.nextDouble();
        System.out.print("Muz Kaç Kilo: ");
        m*=scan.nextDouble();
        System.out.print("Patlıca Kaç Kilo: ");
        p*=scan.nextDouble();

        sum=a+e+d+m+p;

        System.out.println("Toplam Tutar:" +sum);
    }
}