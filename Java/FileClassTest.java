/**
 * Java的文件类File
 * File类包含了获取一个文件/目录的属性,以及对文件/目录进行改名和删除的方法
 * 1. Java的目录分隔符是斜杠(/),Windows中的目录分隔符为反斜杠(\)
 * 2. Scanner类从文件中读取文本数据,PrintWriter类向文本文件写入数据
 */

import java.io.File;
import java.util.Scanner; //注意Scanner所属的包
import java.io.PrintWriter;
import java.io.IOException;

public class FileClassTest{
	public static void main(String[] args) throws IOException{
		//1.1File类构造方法
		File file1 = new File("C:\\Users\\zhangxu\\Downloads\\book\\test1.txt"); //需要添加转移符号
		File file2 = new File("C:\\Users\\zhangxu\\Downloads\\book\\test.txt");
		//1.2常见方法的使用
		System.out.println("是否表示一个目录： " + file1.isDirectory()); //false,因为没有book1文件夹
		System.out.println("文件是否存在：" + file2.exists());
		System.out.println("文件长度：" + file2.length() + "bytes");
		System.out.println("文件是否可读：" + file2.canRead());
		System.out.println("文件是否可写：" + file2.canWrite());
		System.out.println("文件是否为文件：" + file2.isFile());
		System.out.println("文件是否绝对路径：" + file2.isAbsolute());
		System.out.println("文件的绝对路径为：" + file2.getAbsolutePath());
		System.out.println("文件上次修改时间：" + new java.util.Date(file2.lastModified()));


		//2.1写入文件
		PrintWriter output = new PrintWriter(file2);
		//PrintWriter output = new PrintWriter("C:\\Users\\zhangxu\\Downloads\\book\\test.txt"); //这种方式也可以·	·
		output.println("print(s:string) ---> void"); //打印字符串并换行
		output.print(new char[]{'a','b','c'});

		output.close(); //关闭以后才能将数据写入文件
		//2.2使用try-with-resources自动关闭资源
		try( //注意这里是小括号
			PrintWriter output1 = new PrintWriter(file1);//资源的声明和创建必须是同一个语句,放在这里
		){
			output1.println("34 567\n"); //执行完此句后,资源自动关闭
		}

		//3.1读入文件
		//Scanner input = new Scanner(System.in); //键盘标准输入
		Scanner inputFile = new Scanner(file2); //给文件写入
		while(inputFile.hasNext()){
			System.out.println(inputFile.nextLine()); //直接读取一行,可以换成next(),此时以空格分隔
		}

		inputFile.close(); //释放资源,非必须
		//3.2 Scanner工作原理
		//next() nextInt() nextDouble()等称为标记读取法,默认标记为空格
		
		System.out.println("获取特定平台的行分隔符：" + System.getProperty("line.separator"));
		Scanner inputFile2 = new Scanner(file1); //假设file1中包含一行： 34 567 换行符
		int intValue = inputFile2.nextInt(); //得34
		String value = inputFile2.nextLine();//得" 567"
		System.out.println(intValue);
		System.out.println(value);

		Scanner inputFile3 = new Scanner(System.in); //依次输入:34空格567换行
		System.out.print("请输入： ");
		System.out.println("nextInt得值为：" + inputFile3.nextInt());
		System.out.println("nextLine得值为：" + inputFile3.nextLine());
		

	}
}