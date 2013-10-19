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
           
           for( i=0;i<=number-K;i++)
            {
              temp=0;
           //   System.out.println("for: "+numberList[i]);
              for(int j=i;j<i+K;j++)// j is the starting index of first digit
                   {  
                                       
                     for(int p=j;p<i+K-1;p++)// k-1
                   {
               //  System.out.println(numberList[j]+"-"+numberList[p+1]);
                temp+=Math.abs(numberList[j]-numberList[p+1]);
                 }  
                 } 
               // System.out.println(); 
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
