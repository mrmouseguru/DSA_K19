/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa_k19;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author phuoc
 */
public class DSA_K19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        System.out.print("Hello World");
        int[] arr = {10, 5, 7, 20, 100, 
                    2, 11, 15, 1, 200,
        10, 5, 7, 20, 100, 
                    2, 11, 15, 1, 200,
        10, 5, 7, 20, 100, 
                    2, 11, 15, 1, 200,
        10, 5, 7, 20, 100, 
                    2, 11, 15, 1, 200,
        10, 5, 7, 20, 100, 
                    2, 11, 15, 1, 200,
        10, 5, 7, 20, 100, 
                    2, 11, 15, 1, 200,
        10, 5, 7, 20, 100, 
                    2, 11, 15, 1, 200,
        10, 5, 7, 20, 100, 
                    2, 11, 15, 1, 200,
        10, 5, 7, 20, 100, 
                    2, 11, 15, 1, 200,
        10, 5, 7, 20, 100, 
                    2, 11, 15, 1, 200};//size = 100
        //gọi hàm - câu lệnh lời gọi hàm
        //đồng hồ
        //bấm đồng hồ
        long startPoint;
        startPoint = Calendar.getInstance().getTimeInMillis();
        printMang(arr);
        //bấm đồng hồ
        long endPoint;
        endPoint = Calendar.getInstance().getTimeInMillis();
        long result = endPoint - startPoint;
        
        System.out.println("Result (millisecond): " + result);
    }
    
    //hàm printMang
    /*
    input size: 10
    số operations: 10 */
   static void printMang(int[] a)
    {
        int len = a.length;
        
        for(int i = 0; i < len; i++){
            System.out.println(a[i]);
        }
    }
    
    
}
