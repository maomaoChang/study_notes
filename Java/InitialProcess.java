/**
 * 对象的初始化过程
 * 执行顺序：静态代码块—>构造代码块—>构造函数
 */
public class InitialProcess{
	//一个特殊函数。作为程序的入口，可以被jvm调用。
	public static void main(String[] args) {
		Test test = new Test();
	}
}

/* 对象初始化并调用成员的过程
Person p = new Person(“zhangsan”,20);
1.	因为new用到了Person.class.所以会先找到Person.class文件并加载到内存
并初始化static变量
2. 执行该类的static代码块，如果有的话，给Person.class类进行初始化
3. 在堆内存中开辟空间，分配内存地址
4. 在堆内存中建立对象的特有属性，并进行默认初始化（string=null, int = 0）
5. 对属性进行显示初始化（特有属性成员的默认值，如String name = “LiSi”;）
6. 对对象进行构造代码块初始化
7. 对对象进行对应的构造函数初始化
8. 将内存地址赋给栈内存中的p变量。
*/

/* 对象调用非静态方法的过程：
  p.setName(“Wangwu”); //name=”wangwu”
1. 栈区建立setName方法的空间，包含name,this关键字
2. 把p的指向传递给this
*/

class Test{
	static{
     System.out.println("静态代码块执行完成");
	}

	private static final int SIZE = 10; //静态变量


	double doubeValue = 1.0;

	//构造代码块
	{
		System.out.println("doubeValue=" + doubeValue +",表示对象显示初始化优先于构造代码块初始化");
		System.out.println("构造代码块执行完成");
	}

	Test(){

		System.out.println("构造函数执行完成");
	}

}

