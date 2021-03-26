import java.util.Scanner;

public class Sum1 {
     
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int count=0;//计分；
        
        char str=0;
        //生成运算符；
        double result=0;
        
       for(int i=0;i<10;i++){
             int num1=(int)(Math.random()*(99-10+1)+10);
        int num2=(int)(Math.random()*(99-10+1)+10);
        int flag=(int)(Math.random()*(4-1+1)+1);//代表[+,-,*,/]四种运算;
            switch(flag){
            case 1:
            str='+';
           result=num1+num2;
           break;
            case 2:
            str='-';
            result=num1-num2;
                    break;
             case 3:
            str='*';
            result=num1*num2;
            break;
             case 4:
              str='/';
              result=num1/num2;
              result=result*100/100.0;
              break;
    }
           System.out.print(num1);
             System.out.print(str);
             System.out.print(num2+"=");
           double a= scanner.nextDouble();
               if(a==result){
                   count+=10;
               }
              
           }
          System.out.print("得分:"+count);
       }
       
    }


