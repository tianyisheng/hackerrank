import java.io.*;
import java.util.*;

public class Solution{

   public static void main(String args[]){

   try{
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   
       String input;
       
       input=br.readLine();
       int number=Integer.parseInt(input);
       input=br.readLine();
       int K=Integer.parseInt(input); 
       int numberList[]=new int[number];
       int i=0;
       int temp=0;
       int result=Integer.MAX_VALUE;
//      System.out.println("get number: "+number);
       while(i<number){

           input=br.readLine();
           int num1=Integer.parseInt(input);
           numberList[i]=num1;
           i++;           
           }       
           Arrays.sort(numberList);
           
           for( i=K;i<number;i++)
            {
               temp=numberList[i-1]-numberList[i-K];
               if(temp<result) {
                  result=temp;
                 }
            }
         System.out.println(result);
           
    }
      catch(IOException io) {

         io.printStackTrace();
     }
  }
}
