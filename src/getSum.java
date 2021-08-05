import java.util.Scanner;
public class getSum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        boolean iscorrect=false;
        while(!iscorrect)
        {
            try{
                System.out.print("请输入两个整数:");
                String a=input.next();
                String b=input.next();
                int a2=Integer.parseInt(a);
                int b2=Integer.parseInt(b);
                System.out.println("两个数的和是："+(a2+b2));
                iscorrect=true;
            }
            catch(NumberFormatException ex)
            {
                System.out.println("输入错误！请重新输入！");
            }
        }
    }
}
