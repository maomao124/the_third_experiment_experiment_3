/**
 * Project name(项目名称)：第三次实验 实验3
 * Package(包名): PACKAGE_NAME
 * Class(类名): LserPrinter
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/5
 * Time(创建时间)： 23:00
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class LserPrinter extends Printer
{

    LserPrinter(String printerType)
    {
        super(printerType);
    }

    @Override
    void print(String txt)
    {
        System.out.println("LserPrinter   "+txt);
    }
}
