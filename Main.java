package exercise15.com;

import java.util.*;

public class Main {

  public static void main(String[] args) {
   
   Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
      int  rows = in.nextInt();
                
        System.out.print("Введите количество столбцов массива: ");
      int  cols = in.nextInt();  
  
  
    int[][] arr = new int[rows][cols];

    for (int i = 0; i < arr.length; i++) {
       for (int j = 0; j < arr[i].length; j++) {
        System.out.println("Введите элемент arr[" + i + "][" + j + "]:");
         
        arr[i][j] = in.nextInt();
    }
   }
   
       boolean isSorted = true;
        int buf = 0;
        
        while (isSorted) {
          isSorted = false;
         
       for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
             if (arr[i][j] > arr[i][j+1]) {
               isSorted = true;
               buf = arr[i][j];
               arr[i][j] = arr[i][j+1];
               arr[i][j+1] = buf;
             }
           }    
         }
       }  
     System.out.println(Arrays.toString(arr[i][j]));
  }
}
