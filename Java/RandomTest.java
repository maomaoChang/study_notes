/**
 * Java随机函数的使用总结
 */

import java.util.Random;


public class RandomTest{

	public static void main(String[] args) {
		//1.Math.random()静态方法,返回一个[0，1)的double型随机数
		System.out.println("静态方法产生0至1的随机数：" + Math.random());

		//有时候,需要返回一个[a,b)的随机数,则可以这样实现
		// a + Math.random()*(b-a)
		System.out.println("返回一个[50,100)的随机整数：" + (50 + (int)(Math.random()*(100-50))));



		//2.使用Random类的方法
		Random random = new Random();
		//Random random = new Random(10000); //new Random(seed:long) 特定值作为随机数种子
		System.out.println("返回随机的Int值：" + random.nextInt());
		System.out.println("返回1000以内随机的Int值：" + random.nextInt(1000)); //nextInt(n:int) [0,n)的Int
		System.out.println("返回随机的long值：" + random.nextLong());
		System.out.println("返回随机的double值：" + random.nextDouble()); //[0.0,1.0)的double值
		System.out.println("返回随机的float值：" + random.nextFloat()); //[0.0f,1.0f)的double值
		System.out.println("返回随机的boolean值：" + random.nextBoolean()); 

		//注意：种子是一个用于初始化一个随机数字生成器的数字
		//如果两个new Random(seed)有相同的种子，它们将产生相同的随机序列
	}
	
}