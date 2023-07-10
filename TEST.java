import java.util.Scanner;

public class TEST {
    public static void main(String [] Args){

        int mat,fiz,kim,biyo,turk,tarih,muzik;

        double ort;

        boolean test,test1;

        String str,str1;

        Scanner inp = new Scanner(System.in);

        System.out.println("matematik notunu giriniz:)");
        mat = inp.nextInt();
        test1 = (mat < 100);

        str1 = test1 ? "anladım":"100 den büyük girmeyiniz :! ";
        System.out.println(str1);

        System.out.println("fizik notunu giriniz:)");
        fiz = inp.nextInt();

        System.out.println("kimya notunu giriniz:)");
        kim = inp.nextInt();

        System.out.println("biyoloji notunu giriniz:)");
        biyo = inp.nextInt();

        System.out.println("türkçe notunu giriniz:)");
        turk = inp.nextInt();

        System.out.println("tarih notunu giriniz:)");
        tarih = inp.nextInt();

        System.out.println("müzik notunu giriniz:)");
        muzik = inp.nextInt();


        ort = (mat+fiz+kim+biyo+turk+tarih+muzik)/7;

        System.out.println(ort);

        test = (ort >= 60);

        str = test ? "Sınıfı geçtiniz <3 ":"Sınıfta kaldınız :! ";

        System.out.println(str);







    }1000

}
