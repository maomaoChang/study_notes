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
		 * 变量的作用域
		 * 1.实例变量和静态变量的作用域是整个类,无论变量在哪里声明
		 * 2.局部变量在方法内部声明和创建,遵从局部变量优先法则
		 */
		
		//this引用。 1.指向调用对象本身的引用名 2.必须放在第一句
		
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