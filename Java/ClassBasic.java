/**
 * 类基础相关
 * @author maomaochang
 * @since 2018-6-9
 */
import java.util.Date;
import java.util.Random;

public class ClassBasic{
	
	//构造方法在使用new操作符创建对象的时候调用
	public static void main(String[] args) {
		//java.util.Date类
		System.out.println("当前时间(毫秒值)：" + System.currentTimeMillis()); //System类静态方法取时间
		Date dateObject = new Date();
		System.out.println("当前时间(毫秒值Date类)：" + dateObject.getTime()); //System类静态方法取时间

		//Math类
		System.out.println("随机数产生器Math.randow(): " + Math.random()); //产生0-1的double
		Random randomObject = new Random();
		System.out.println("随机数产生器Random: " + randomObject.nextInt(100)); //产生0-1000的int

		//静态变量、常量和方法		
		System.out.println("静态数据域X的值为：" + StaticVariable.X);
		
		/**
		 * 可见性修饰符
		 * 1. package-private，或者称为default
		 * 2. public
		 * 3. private 修饰方法和数据，只能在它自己的类中才能被访问
		 * 4. protected 
		 */
		
		//数据域封装
		StaticVariable  x = new StaticVariable();
		x.setAge(8);
		System.out.println("测试数据域封装：" + x.getAge());

		//参数传递,Java只有一种参数传递方式：值传递(pass-by-value)
		//所以，基本类型参数传递值，引用类型参数传递的是对象的地址
		
		//对象数组
		StaticVariable[] objectArray = new StaticVariable[10]; //默认值为null 

		//不可变对象和类,String就是一个典型的不可变类 
		
		/**
		 * 
		 * 变量的作用域
		 * 1.实例变量和静态变量的作用域是整个类,无论变量在哪里声明
		 * 2.局部变量在方法内部声明和创建,遵从局部变量优先法则
		 */
		
		//this引用。 1.指向调用对象本身的引用名 2.必须放在第一句
		
		//基本数据类型作为对象处理
		int intValue = new Integer("5").intValue();
		System.out.println("包装类的数值：" + intValue);

		//数值类的compareTo方法
		System.out.println(new Integer("5").compareTo(new Integer(5)));
		Double doubleObject = Double.valueOf("12.4"); //valueOf传入String,转换成Double对象

		System.out.println("转成特定进制的数：" + Integer.parseInt("11",2)); //结果位3
		System.out.println("String格式化：" + String.format("%x",26)); //26转成16进制数1A

		//装箱与开箱
		//BigInteger和BigDecimal 不可变对象(java.math)
		BigInteger a = new BigInteger("882345898572378459835792");
		BigInteger b = new BigInteger("88234535792");
		BigInteger c = a.multiply(b);
		BigInteger d = a.divide(b);

		//String 
		String str = new String("welcome to java");
		char[] charArray = {'w','e','l','c','o'};
		String newStr = new String(charArray); //通过字符数组来初始化字符串
		//限定字符串：JVM为了节省内存, 对相同字符学列的字符串直接量使用同一个实例
		//字符串的替换和分隔
		System.out.println("Welcome".replace('e','A')); //WAlcomA
		System.out.println("Welcome".replaceFirst('e','A')); //WAlcome
		System.out.println("Welcome".replace('e','A')); //WAlcomA
		System.out.println("Welcome".replace('el','A')); //WAcome
		String[] token = "Java#HTLM#Perl".split("#");

		//String正则匹配
		
		//String和数组之间的转换

		 
	}

}


	class StaticVariable{

		final static int X = 35; //静态常量一般声明为final static
		private int age;

		public void setAge(int age){
			this.age = age;
		}

		public int getAge(){
			return this.age;
		}
	}