/**
 * Java的文件类File
 * File类包含了获取一个文件/目录的属性,以及对文件/目录进行改名和删除的方法
 * 1. Java的目录分隔符是斜杠(/),Windows中的目录分隔符为反斜杠(\)
 * 2. 
 */

import java.io.File;

public class FileClassTest{
	public static void main(String[] args) {
		//File类构造方法
		File file1 = new File("C:\\Users\\zhangxu\\Downloads\\book1");
		File file2 = new File("C:\\Users\\zhangxu\\Downloads\\book\\test.dat");
		//常见方法的使用
		System.out.println("是否表示一个目录： " + file1.isDirectory());
		System.out.println("文件是否存在：" + file2.exists());
		System.out.println("文件长度：" + file2.length() + "bytes");
		System.out.println("文件是否可读：" + file2.canRead());
		System.out.println("文件是否可写：" + file2.canWrite());
		System.out.println("文件是否为文件：" + file2.isFile());
		System.out.println("文件是否绝对路径：" + file2.isAbsolute());
		System.out.println("文件的绝对路径为：" + file2.getAbsolutePath());
		System.out.println("文件上次修改时间：" + new java.util.Date(file2.lastModified()));

	}
}