import java.util.Scanner;

public class Test{
	
	public static void main(String[] args) {
	
		//1. 转二进制
		System.out.println(Integer.toBinaryString(10));	

		float t = 2.3f; //不加f的话，会编译报错

		char c = '你';
		System.out.println(Integer.SIZE/8);

		System.out.println('a');
		System.out.println('a'+1); //这里有个自动类型转换
		System.out.println((char)('a'+1));

		System.out.println("哈哈哈哈\r" + "明天"); // \t很有意思

		//数组初始化的几种方式
		int[] arr1 = {1,3,3,4,5};
		int[] arr2 = new int[4]; //如果使用arr2[4],编译时不会报错，因为只做语法检查，并未开辟内存空间
		int[] arr3 = new int[]{1,2,4,5,5};

		// System.out.println(System.currentTimeMillis()); //系统时间
		// System.out.println("请输入一个Int型参数：");
		// Scanner input = new Scanner(System.in); //标准输入
		// System.out.println("刚刚输入的值为： " + input.nextInt());

		System.out.println((int)(Math.random()*100)); //随机数的产生

		//闰年的判定条件：
		int year=2000; 
		boolean isLeapYear = (year%4==0 && year%100!=0) || year%400==0;
		System.out.println(year + "是否为闰年？  ：" + isLeapYear);
		




	}



}