/**
 * 练习1: 创建一个类,包含一个int域和一个char域,都没有被初始化, 将他们值打印出来,
 * 证明Java执行了默认初始化
 *
 * Created by zzh on 6/11/2020 12:18 AM
 **/
public class DefaultInit {

    static int a;

    static char b;

    public static void main(String[] args) {
        System.out.println("a----" + a);
        System.out.println("b----" + b);
    }

}
