import java.util.Scanner;
public class method {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入1或2或3，1表示method3抛出数组下标越界异常，2表示抛出算术异常，3表示抛出空指针异常");
        int flag=input.nextInt();
        try{
            method1(flag);
            System.out.println("调用method1后语句被执行");
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("main函数发现数组下标越界异常！");
        }
        System.out.println("main函数执行至末尾");
    }
    public static void method1(int flag)
    {
        try{
            method2(flag);
            System.out.println("调用method2后语句被执行");
        }
        catch (ArithmeticException ex){
            System.out.println("method1发现算术异常！");
        }
        System.out.println("method1执行至末尾");
    }
    public static void method2(int flag){
        try{
            method3(flag);
            System.out.println("调用method3后语句被执行");
        }
        catch (NullPointerException ex){
            System.out.println("method2发现空指针异常！");
        }
        System.out.println("method2执行至末尾");
    }
    public static void method3(int flag){
        if(flag==1) throw new ArrayIndexOutOfBoundsException();
        if(flag==2) throw new ArithmeticException();
        if(flag==3) throw new NullPointerException();
    }

}
// 测试时随便做的注释
// 第二条注释
// 第三条