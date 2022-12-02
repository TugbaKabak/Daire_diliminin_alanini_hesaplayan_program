import java.util.Scanner;

public class Daire_Alani_Hesaplayan_Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int yaricap;
        double pi=3.14, cevre, alan, daireDilimininAlani, merkezAciOlcusu;

        System.out.println("Lütfen yarıçap ölçüsünü giriniz: ");
        yaricap= input.nextInt();

        System.out.println("Lütfen merkez açının ölçüsünü giriniz: ");
        merkezAciOlcusu =input.nextDouble();

        alan= pi*yaricap*yaricap;
        System.out.println("Dairenin alanı: "+alan);

        cevre= 2*pi*yaricap;
        System.out.println("Dairenin çevresi: "+cevre);

        daireDilimininAlani = (pi * (yaricap*yaricap) * merkezAciOlcusu) / 360;
        System.out.println("Daire diliminin alanı: "+daireDilimininAlani);
    }
}
