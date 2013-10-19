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
       int index=0;
       int temp=0;
       int result=Integer.MAX_VALUE;
     // System.out.println("get number: "+number);
       while(index<number){

           input=br.readLine();
           int num1=Integer.parseInt(input);
           numberList[index]=num1;
           index++;           
           }       
           Arrays.sort(numberList);
         
         int sum[][]=new int[number][K];    

         for(int i=0;i<number;i++)// sum[i][j] means the sume of n[i]+n[i+1]...n[i+j-1] total j+1 elements.            
              sum[i][0]=0;

         for(int i=0;i<number;i++)
            for(int j=1;j<K;j++)
                   if(i+j<number)
                          sum[i][j]=sum[i][j-1]+numberList[i+j];   
     
      
           for(int i=0;i<=number-K;i++)
            {
               temp=0; 
             System.out.println("begin with: "+numberList[i]); 
             for(int j=i;j<i+K-1;j++)// sum from i.
              {
                temp+=(sum[j][(i+K)-j-1]-(i+K-j-1)*numberList[j]);
               System.out.println("sum["+Integer.toString(j)+"]"+"["+Integer.toString(i+K-j-1)+"] -numberList["+Integer.toString(j)+"],where sum[][]="+Integer.toString(sum[j][(i+K)-j-1])+" numberList[j]= "+Integer.toString(numberList[j])); 
               System.out.println("temp:"+Integer.toString(temp));
              }
              if(temp<result)
                   result=temp;          
            }
        System.out.println(result);
           
    }
      catch(IOException io) {

         io.printStackTrace();
     }
  }
}
