import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdv, hesap;
        boolean limit;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz :");
        tutar = input.nextDouble();

        limit = (tutar <= 1000);
        kdv = (limit == true) ? 0.18 : 0.08;

        System.out.println("KDV Oranı :" + kdv);
        System.out.println("KDV Tutarı :" + (tutar * kdv));

        hesap = tutar + (tutar * kdv) ;

        System.out.print("KDV'li Fiyat :" + hesap);


    }
}