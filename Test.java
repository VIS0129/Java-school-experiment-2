


//设计并实现一个程序，由键盘输入一个整数，然后打印输出这个数所包含的奇数数字、非零偶数数字和0的个数。

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
   int z=0;int x=0;int c=0;//z为奇数，x为偶数，c为0；
        System.out.print("Input x=");
    Scanner scanner =new Scanner(System.in);
    int a=scanner.nextInt();
    boolean flag=true;
        while(flag){
            switch(a%10){
                case 0:
                c++;
                
                break;
                    case 1:
                     case 3:
                     case 5:
                        case 7:
                        case 9:
                         z++;
                         break;
                        case 2:
                        case 4:
                        case 6:
                        case 8:
                            x++;
                            break;
                     }
            a=a/10;
            if(a==0){
                flag=false;
            }
        }
        System.out.println("奇= "+z);
         System.out.println("偶= "+x);
          System.out.println("零= "+c);
        
        
        
    }
    
}
