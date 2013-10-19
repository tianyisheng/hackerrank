import java.io.*;
import java.util.*;

public class Solution{

   public static void main(String args[]){

   try{
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   
       String input;
       
       input=br.readLine();
       int number=Integer.parseInt(input); 
//      System.out.println("get number: "+number);
       while(number-->0){

           input=br.readLine();
           String[] temp= input.split(" "); 
  //        System.out.println("num1:"+temp[0]+", num2:"+temp[1]+", num3"+temp[2]);
           int num1=Integer.parseInt(temp[0]);
           int num2=Integer.parseInt(temp[1]);
           int num3=Integer.parseInt(temp[2]);
           int temp1=num1/num2;
           int rest=temp1;
            while(rest>=num3)
           {
             temp1+=(rest/num3);
             rest=rest/num3+(rest%num3);
           }       
          System.out.println(temp1);

        }
           
    }
      catch(IOException io) {

         io.printStackTrace();
     }
  }
}
