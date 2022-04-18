package shapes;
import java.util.Scanner;
public class HinhTru extends HinhTron {
    public float chieuCao;
    public HinhTru() {
        ten = "Hình Trụ" ;
    }
    public void nhapchieuCao() {
        nhapbanKinh() ;

        System.out.println("Chiều cao = ") ;
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }
    public void tinhtheTich() {
        tinhdienTich() ;
        theTich = dienTich * chieuCao;
    }
}