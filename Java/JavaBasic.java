import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class JavaBasic{
	
	public static void main(String[] args) {
	
		//1. 转二进制
		System.out.println(Integer.toBinaryString(10));	

		float t = 2.3f; //不加f的话，会编译报错

		char c = '你';
		System.out.println(Integer.SIZE/8);

		System.out.println('a');
		System.out.println('a'+1); //这里有个自动类型转换
		System.out.println((char)('a'+1));

		System.out.println("哈哈哈哈\r" + "明天"); // \t很有意思,是一个回车符，意思是回到行首

		//数组初始化的几种方式
		int[] arr1 = {1,3,3,4,5};
		int[] arr2 = new int[4]; //如果使用arr2[4],编译时不会报错，因为只做语法检查，并未开辟内存空间
		int[] arr3 = new int[]{1,2,4,5,5};

		// System.out.println(System.currentTimeMillis()); //系统时间
		// System.out.println("请输入一个Int型参数：");
		Scanner input = new Scanner(System.in); //标准输入
		// System.out.println("刚刚输入的值为： " + input.nextInt());

		System.out.println((int)(Math.random()*100)); //随机数的产生

		//闰年的判定条件：
		int year=2000; 
		boolean isLeapYear = (year%4==0 && year%100!=0) || year%400==0;
		System.out.println(year + "是否为闰年？  ：" + isLeapYear);

		char a = 'A';
		System.out.println(++a);
		System.out.println(a);

		//Character类提供了一些字符串函数
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isLetter('B'));
		System.out.println(Character.toLowerCase('T'));

		String firstr = "Welcome to Java!"; //字符串的本质是字符序列
		//String类的一些实例方法 length(),charAt(index),concat(s),toUpperCase(),toLowerCase(),trim()用于去除两端的空白字符;
		//控制台读取字符串方法,next()方法以空白字符结束字符串，或者nextLine()读取一行，只以换行符结束
		//String inputStr = input.next();
		
		//String 对象的比较方法 equals(s1),equalIgnoreCase(s1),compareTo(s1),compareToIgnoreCase(s1),startsWith(prefix),endWith(suffiex),contains(s1)
		//获得子字符串 substring(beginIndex) 只给出开始位置
		//            substring(beginIndex,endIndex) 截取 beginIndex~endIndex-1的字串 (hive中第二个参数是截取的长度，需要留意)

		//输入输出重定向 将输入得数据用空格隔开,存放在一个名为input.txt的文件中，并将System.out.println的内容打印到output.txt中
		//java SentinelValue < input.txt>output.txt; //SentinelValue为一个包含main方法的类
		
		do{ 
			int i = 1+1;
		}while(1>2); //注意分号不能省略

		int[] array = new int[10];
		System.out.println("数组的长度为：" +  array.length);

		//数组的复制,java数组复制不能简单的list2=list1.有三种方式：1.逐个元素复制2.System类中的静态方法arraycopy3.clone方法
		int[] arraym = {3,1,4,5,6};
		System.arraycopy(arraym,0,array,0,arraym.length);

		//可变长参数列表
		//public static void printMax(double... numbers) //numbers是一个数组
		
		//java.util.Arrays类中的静态方法
		//Arrays.sort(numbers)   Arrays.parallelSort(numbers)  Arrays.sort(numbers,1,10)数组中部分排序
		
		//二维数据的创建必须指定行
		int[][] arrayd = new int[5][];
	}

	//Java获取键盘输入的两种方式其一
	public static String getStringKeyboard() throws IOException {  
	    InputStreamReader isr = new InputStreamReader(System.in);  
	    BufferedReader br = new BufferedReader(isr);  
	    String s = br.readLine();  
	    return s;  
	}  
	//Java获取键盘输入的两种方式其二
	public static int getIntKeyboard() {  
	    Scanner sca = new Scanner(System.in);  
	    return sca.nextInt();  
	}	



}