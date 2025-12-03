/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_k19;

/**
 *
 * @author phuoc
 */
public class DemoThuatToanFind15 {
    
    public static void main(String[] args) {
        int a[] = {4, 2, 11, 5, 30};
       boolean result = find15(a);
       
       if(result){
           System.out.println("Tìm thấy 15");
       }else{
            System.out.println("KHÔNG Tìm thấy 15");

       }
    }
    
    
    static boolean  find15(int[] arr)
    {
        boolean found = false;
        int n;//chiều dài mảng
        n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == 15){
                found = true;
                break;//thoát loop
            }
        }
        return found;
    }
}
