package exercise15.com;

import java.util.*;

public class Main {

  public static void main(String[] args) {
  
        Scanner in = new Scanner(System.in);     
        System.out.print("Введите размер массива: ");
      int  n = in.nextInt();  
  
  
    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
        System.out.println("Введите элемент arr[" + i + "]");
         
        arr[i] = in.nextInt();
    }
   
       boolean isSorted = true;
        int buf = 0;
      
        while (isSorted) {
          isSorted = false;
         
     for (int i = 0; i < arr.length-1; i++) {
             if (arr[i] > arr[i+1]) {
               isSorted = true;
               buf = arr[i+1];
               arr[i+1] = arr[i];
               arr[i] = buf;
             }
           }      
         }
         System.out.println("Отсортированный массив: ");
      for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
      }
      System.out.println();
  }
}
