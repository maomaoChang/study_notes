/**
 * 所谓单例模式,是指一个类在内存中只存在一个对象。
 * 主要设计思想是：
 * 1.将构造函数私有化
 * 2.在类中创建一个本类对象
 * 3.提供一个方法可以获取到该对象
 */

/**
 * 实现方法1：饿汉式
 * 调用方式：SingleMode single = SingleMode.getInstance();
 */
public class SingleMode{
	private SingleMode(){} 
	private static SingleMode single = new SingleMode();
	public static SingleMode getInstance(){
		return single;
	}
}

/**
 * 实现方式2：懒汉式(对象的延时加载)
 * 调用方式：
 */
public class SingleMode{
	private SingleMode(){} 
	private static SingleMode single = null;
	public static SingleMode getInstance(){
		if (single == null){
			single = new SingleMode(); //调用getInstance方式时,才会创建对象
		}
		return single;
	}
}


/**
 * 实现方法3：懒汉式改进(线程同步)
 */
public class SingleMode{
	private SingleMode(){} 
	private static SingleMode single = null;
	public static SingleMode getInstance(){
		if(single == null){
			synchronized(SingleMode.class){ //线程A获得锁之后,其他线程进不来
				if(single == null)
					single = new SingleMode();
			}
		}
		return single;
	}
}