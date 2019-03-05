
package hesapmakinesi;
import java.util.Scanner;
public class HesapMakinesi {
    public static int cikarma(int a, int b){
    return (a-b);
    }
    public static int toplama(int a, int b){
    return (a+b);
    }
    public static int toplama(int a, int b, int c){
    return (a+b+c);
    }
    public static int carpma(int a, int b){
    return (a*b);
    }
    public static int carpma(int a, int b, int c){
    return (a*b*c);
    }
    public static double bolme(int a, int b){
    return ((double)a/b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        String islemler = "1.Toplama\n"
                + "2.Çıkarma\n"
                + "3.Çarpma\n"
                + "4.Bölme\n"
                + "Çıkış İçin q'ya basın.";
        while (true) {   
        System.out.println("*****************************");
        System.out.println(islemler);
        System.out.println("*****************************");
            System.out.print("İşlem seçiniz...");
            String islem = input.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor..."); 
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Kaç değer toplayacaksınız?(2 veya 3)");
                int degerSayisi = input.nextInt();
                
                if (degerSayisi == 2){
                    System.out.print("a :");
                    int a = input.nextInt();
                    System.out.print("b :");
                    int b = input.nextInt();
                    input.nextLine();
                    System.out.println("Girilen sayıların toplamı :" + (toplama(a, b)));
                  
                        
                }
                else if (degerSayisi == 3){
                    System.out.print("a :");
                    int a = input.nextInt();
                    System.out.print("b :");
                    int b = input.nextInt();
                    System.out.print("c :");
                    int c = input.nextInt();
                    input.nextLine();
                    System.out.println("Girilen sayıların toplamı :" + (toplama(a, b, c)));
                            
                }
                else{
                    System.out.println("Uygun metod bulunmuyor...");
                }
                
            }
            else if (islem.equals("2")){
                System.out.print("a :");
                int a = input.nextInt();
                System.out.print("b :");
                int b = input.nextInt();
                input.nextLine();
                System.out.println("Girilen sayıların farkı :" + (cikarma(a, b)));
            }
            else if (islem.equals("3")) {
                System.out.println("Kaç değer çarpacaksınız?(2 veya 3)");
                int degerSayisi = input.nextInt();
                
                if (degerSayisi == 2){
                    System.out.print("a :");
                    int a = input.nextInt();
                    System.out.print("b :");
                    int b = input.nextInt();
                    input.nextLine();
                    System.out.println("Girilen sayıların çarpımı :" + (carpma(a, b)));
                  
                        
                }
                else if (degerSayisi == 3){
                    System.out.print("a :");
                    int a = input.nextInt();
                    System.out.print("b :");
                    int b = input.nextInt();
                    System.out.print("c :");
                    int c = input.nextInt();
                    input.nextLine();
                    System.out.println("Girilen sayıların çarpımı :" + (carpma(a, b, c)));
                            
                }
                else{
                    System.out.println("Uygun metod bulunmuyor...");
                }
            }
            else if (islem.equals("4")) {
                System.out.print("a :");
                int a = input.nextInt();
                System.out.print("b :");
                int b = input.nextInt();
                input.nextLine();
                System.out.println("Girilen sayıların bölümü :" + (bolme(a, b)));
            }
            else {
                System.out.println("Geçersiz işlem");
            }
        }
    }    
}
