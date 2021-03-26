import java.util.Scanner;
public class instance {
        public static void main(String[] args){
     for(int i=1;i<=20000;i++)
     {
         if(instance.isPrime(i)){
         System.out.print(i);
        System.out.print("\n");
       
          }
        }
        }
  
        
        static boolean isPrime(int n){
   
        for(int x=1;x<n;x++){
   if(n==x*x+x+41)
       if(n%x==0&&x!=1)
   {
           return true; 
        } 
        }  
        return false;
        }
}