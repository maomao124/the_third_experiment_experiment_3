/**
 * Project name(项目名称)：第三次实验 实验3
 * Package(包名): PACKAGE_NAME
 * Class(类名): Printer
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/5
 * Time(创建时间)： 22:56
 * Version(版本): 1.0
 * Description(描述)： 无
 */
abstract class Printer
{
    private String printerType;

    Printer(String printerType)
    {
        this.printerType = printerType;
    }

    abstract void print(String txt);

    void showMyType()
    {
        System.out.println("My Type is:" + printerType);
    }
}

