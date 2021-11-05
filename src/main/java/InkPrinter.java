/**
 * Project name(项目名称)：第三次实验 实验3
 * Package(包名): PACKAGE_NAME
 * Class(类名): InkPrinter
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/5
 * Time(创建时间)： 22:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class InkPrinter extends Printer implements IScan
{

    InkPrinter(String printerType)
    {
        super(printerType);
    }

    @Override
    public void scan()
    {
        System.out.println("调用scan方法");
    }

    @Override
    void print(String txt)
    {
        System.out.println("InkPrinter  "+txt);
    }
}
