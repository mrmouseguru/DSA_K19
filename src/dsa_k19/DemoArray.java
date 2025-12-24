package dsa_k19;

/**
 *
 * @author phuoc
 */
public class DemoArray {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 3, 9};//size = 5
        int b[] = new int[50];//size = 50
        int c[] = new int[1000];
        
        System.out.println("a[4]: " + arr[4]);//==> 9
        System.out.println("b[49]: " + b[49]);
        //c[999];//=>O(1)
        
        int newArr[] = themDau(arr, 10);
        
         //in mảng mới
        System.out.println("in mang moi");
        for(int i = 0; i < newArr.length; i++)
        {
            System.out.printf
        ("newArray[%d] = %d\n", i, newArr[i]);
        }
    }
    
    static int[] themDau(int a[], int key){
        int oldSize = a.length;
        int newArray[] = new int[oldSize+1];
        //dời mảng cũ sang mã mới
        for(int i = 0; i <oldSize; i++){
            newArray[i+1] = a[i];
        }
        newArray[0] = key;
        return newArray;
       
    }
    
}
