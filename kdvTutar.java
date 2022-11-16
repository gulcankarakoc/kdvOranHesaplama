import java.util.Scanner;
 public class kdvTutar {
   public static void main(String[] args){

     double kdvOrani = 0.18 , kdvOrani2=0.08;
     double tutar;
     Scanner input = new Scanner(System.in);
     System.out.println("Ürün Fiyat Girin:");
     tutar=input.nextDouble();

     double totalKdv =  (tutar <= 1000) ? tutar * kdvOrani : tutar * kdvOrani2;

   System.out.println("KDV'siz Tutar :"+tutar);
     System.out.println("KDV'li Tutar:"+(tutar+totalKdv));
     System.out.println("Toplam KDV Tutarı:"+ (totalKdv));

     double kdvOran = (tutar>1000) ? kdvOrani2 : kdvOrani;
     System.out.println("KDV Orani:"+ kdvOran);

     }
   }

