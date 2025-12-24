package dsa_k19;

/**
 *
 * @author phuoc
 */
public class BinarySearchDemo {
 
    public static void main(String[] args) {
        int arr[] =  {2, 4, 6, 8, 10, 12, 14};
        boolean result = binarySeach(arr, 1);
        
        if(result)
        {
            System.out.println("Tìm thấy");
        }else
        {
            System.out.println("Không tìm thấy");
        }
    }
    
 static boolean binarySeach(int[] a, int key)
{
    int left = 0;
    int right = a.length -1;
    boolean found = false;
    int count = 0;
    while(left <= right)
    {
        count++;
        int mid = (left + right)/2;
        if(a[mid] == key)
        {
            found = true;
            break;
        }
        
        if(a[mid] < key){
            left = mid + 1;
        }else
        {
            right = mid -1;
        }
    }
    System.out.println("count: " + count);
    return found;
}

}

