package javaapplication3;
import java.util.Arrays;
import java.util.Scanner;
public class JavaApplication3 {   
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
//        the array
        System.out.print("Enter array size : ");
        int size = s.nextInt();
        int [] arr =new int [size];
        for(int i=0 ; i<size ;i++){
            System.out.print("Enter value number "+(i+1)+" : ");
            arr[i] = s.nextInt();
        }
        
        {
//        selection sort
        int [] a1 = arr;
        int small;
        for(int i=0 ; i<=size;i++){
            for(int j=i ; j<size;j++){
                if(a1[i]>a1[j]){
                    small=a1[j];
                    a1[j]=a1[i];
                    a1[i]=small;
                }
            }
        }
        System.out.println("sorting array by selection algorithm : "+Arrays.toString(a1));
        }
        
        {
//        bubble sort
        int [] a2 = arr;
        boolean sorted = false ;
        int small;
        while(!sorted){
            for(int i=0 ;i<size-1;i++){
                if(a2[i]>a2[i+1]){
                    sorted =false;
                  small = a2[i+1];
                  a2[i+1]=a2[i];
                  a2[i]=small;
                }
                else 
                    sorted= true;
            }
        }
            System.out.println("Sorting array by bubble sort : "+Arrays.toString(a2));
        }
    }
}