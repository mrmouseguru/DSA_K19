/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_k19;

/**
 *
 * @author phuoc
 */
public class ConvertRomainToInt {
    public static void main(String[] args) {
        String s = "XLIX";
        //chiều dài của chuỗi
        s.length();//4
        s.charAt(0);//X
    }
    
    static int getInt(char c)
    {
        int number = 0;
        if(c == 'I')
        {
            number = 1;
        }
        
        if(c == 'V'){
            number = 5;
        }
        
        return number;
    }
    
}
