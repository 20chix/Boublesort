/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boublesort;

/**
 *
 * @author hadielmekawi
 */


public class BoubleSort {
 //some global variables
 static double[] numbers = {37, 22, 91, 67, 66, 45, 73, 69, 40};
 static int N;
public static void main(String[] args) {
 N = numbers.length;
 int k = 1;
 int j = N-2;
 int i;
 while (k < N)
 {
 i = 0;
 while ( i <= j )
 {
 if (notInOrder(i, i+1))
 {
 swap(i, i+1);
 }
 i++;
 }
 k++;
 }
 //output new array
 for (int ii = 0; ii< numbers.length; ii++)
 {
 System.out.print(numbers[ii] + " ");
 }
 System.out.println("");
 }
 static void swap(int i, int j)
 {
 double temp;
 temp = numbers[i];
 numbers[i]=numbers[j];
 numbers[j]=temp;
 }
 static boolean notInOrder(int i , int j)
 {
 return numbers[i]<numbers[j];
 }
}

