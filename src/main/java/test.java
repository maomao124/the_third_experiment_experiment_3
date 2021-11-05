/**
 * Project name(项目名称)：第三次实验 实验3
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/5
 * Time(创建时间)： 22:53
 * Version(版本): 1.0
 * Description(描述)： 3. 抽象类和接口的使用
 * 编写以上类图的代码，并编写测试类测试接口的使用。其中Printer类是一个抽象类，IScan是一个接口，
 * 部分代码已经列出。请大家把剩余的具体类InkPrinter和LserPrinter的代码实现
 */

public class test
{
    public static void main(String[] args)
    {
        InkPrinter i = new InkPrinter("hello");
        i.print("hello");
        i.showMyType();
        i.scan();
        LserPrinter l = new LserPrinter("world");
        l.print("world");
        l.showMyType();
    }
}
