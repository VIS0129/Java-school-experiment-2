


public class PrimeTest {
    public static void main(String[] args){
        int count=0;
        for(int j=10;j<=100;j++)
        {  
          if( PrimeTest.isPrime( j)){
              count++;
              System.out.print(j+"\t");
              if(count%5==0)
                  System.out.print("\n");
          }
        }
    }
   static boolean isPrime(int n){
   boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
   
            if(n%i==0)
            {
              isPrime =false;
            }
            
        }   
        return isPrime;
    }
}
