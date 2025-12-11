package dsa_k19;

/**
 *
 * @author phuoc
 */
public class RomanToInt {
    
    public static void main(String[] args) {
        System.out.println("Thuật toán chuyển "
                + "chuỗi roman thành số nguyên  ");
      //  String s = "XLIX";//49
      String s = "MMMDCCCLXXXVIII";//3888
      //String s = "DCCC";
        //gọi đến hàm romanToInt
        int intNumber;
        intNumber = romanToInt(s);
        System.out.println("" + s + " => " + intNumber);
    }
    
    static int getInt(char c)
    {
        //code
        int number = 0;
        if(c == 'I')
        {
            number = 1;
        }
        
        if(c == 'V')
        {
            number = 5;
        }
        //V
      
        //X
          if(c == 'X')
          {
              number = 10;
          }
        //L
        if(c == 'L')
        {
            number = 50;
        }
        //C
        if(c == 'C')
        {
            number = 100;
        }
        //D
        if(c == 'D')
        {
            number = 500;
        }
        //M
        if(c == 'M')
        {
            number = 1000;
        }
        return number;
    }
    
    static int romanToInt(String s)
    {
        //code
        int n = s.length();
        int total = 0;
        for(int i = 0; i < n-1; i++)
        {
            char currentChar = s.charAt(i);
            int currentInt = getInt(currentChar);
            char nextChar = s.charAt(i+1);
            int nextInt = getInt(nextChar);
            if(currentInt >= nextInt)
            {
                total = total + currentInt;
            }else
            {
                total = total - currentInt;
            }
        }
        
        total = total + getInt(s.charAt(n-1));
             
        return total;
    }
}
