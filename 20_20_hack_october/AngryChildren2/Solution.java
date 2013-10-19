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
       int index=0,temp1=0,temp2=0;
       int result=Integer.MAX_VALUE;
     // System.out.println("get number: "+number);
       while(index<number){

           input=br.readLine();
           int num1=Integer.parseInt(input);
           numberList[index]=num1;
           index++;           
           }       
           Arrays.sort(numberList);
         
      
           for(int i=0;i<=number-K;i++)
            {
             temp1=0;
             temp2=0; 
//             System.out.println("begin with: "+numberList[i]); 
             for(int k=K-1;k>0;k--)// sum from i.
              {
                temp1+=k*numberList[i+k];
                temp2+=k*numberList[i+K-1-k];
              }
              if(temp1-temp2<result)
                   result=temp1-temp2;          
            }
        System.out.println(result);
           
    }
      catch(IOException io) {

         io.printStackTrace();
     }
  }
}
