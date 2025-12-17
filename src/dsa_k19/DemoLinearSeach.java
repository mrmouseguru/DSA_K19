package dsa_k19;

/**
 *
 * @author phuoc
 */
public class DemoLinearSeach {
    
    public static void main(String[] args) {
        int arr[] = {11, 22, 84, 10, 55};
        int key = 10;
        boolean result = linearSearch(arr, key);
        if(result){
            System.out.println("Da tim thay key: " + key);
        }else
        {
            System.out.println("Không tim thay key: " + key);
        }
    }
    
    static boolean linearSearch(int a[], int key){
        int n = a.length;
        boolean found = false;
        for(int i = 0; i< n; i++)
        {
            if(a[i] == key)//T
            {
                found = true;
                break;
            }
        }
        return found;
    }
}
