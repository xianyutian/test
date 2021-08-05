import java.util.Random;
import java.util.Scanner;
public class Search {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int [] list=new int[100];
        for(int i=0;i<100;i++)
            list[i]= (int)(Math.random()*1000);
        System.out.println("请输入0-99中的整数： ");
        int index=input.nextInt();
        try{
            System.out.println("第"+(index+1)+"个随机数是："+list[index]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("out of founds");
        }
    }
}
