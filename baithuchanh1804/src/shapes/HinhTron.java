package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;   
    public HinhTron() {
       ten = "Hình Tròn" ;
   }
   public void nhapbanKinh() {
       System.out.println("Bán Kính = ");
       Scanner scanner = new Scanner(System.in);
       banKinh = scanner.nextFloat() ;
   }
   public void tinhchuVi() {
       chuVi = 2 * Pi * banKinh;
   }
   public void tinhdienTich() {
       dienTich = Pi * banKinh * banKinh;
   }
}

