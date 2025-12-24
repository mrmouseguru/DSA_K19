package dsa_k19;

/**
 *
 * @author phuoc
 */
public class DemoArrayKieuPhucTap {
    
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.maSV = 1;
        sv1.tenSV = "Le van teo";
        sv1.diem = 2.0f;
        SinhVien sv2 = new SinhVien();
        sv2.maSV = 2;
        sv2.tenSV = "Nguyen van ty";
        sv2.diem = 10.0f;
        SinhVien dsSV[] = {sv1, sv2};//size = 1
        printDSSV(dsSV);
    }
    
    static void printDSSV(SinhVien ds[])
    {
        for(int i = 0; i< ds.length; i++)
        {
            System.out.println("SV thu " + (i + 1));
            System.out.
          printf("ma sv: %d, ten sv: %s, diem: %.1f\n",
                  ds[i].maSV, 
                  ds[i].tenSV,
                  ds[i].diem);
        }
    }
    
}
