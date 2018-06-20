/**
 * @author maomaochang
 * 异常处理的优势：将检测错误从处理错误中分离出来
 * Object<---Throwable接口
 * 			   Error: LinkageError、VirtaulMachineError等      			
 * 			   Exception:
 * 					ClassNotFoundException
 * 					IOException
 * 					RuntimeException:运行时异常,通常由Java虚拟机抛出,
 * 					   包括ArithmeticException,NullPointerException,IndexOutOfBoundsException,IllegalArgumentException等
 * 					其他更多的类
 * 异常中除了RuntimeException外，其他异常都需要捕获并处理 	
 *
 * 1.如果方法么有在父类中声明异常,则不能再子类中对其进行继承来声明异常
 * 2.异常类一般至少有两个构造方法,无参方法和一个带可描述这个异常的String参数构造方法
 * 3.异常的捕获遵循栈规则,先判断异常在哪里被捕获并处理
 * 4.捕获异常时,子类的catch块要写在前面,父类的写在后面,否则会编译失败
 */

public class  ExceptionSummary{
	public static void main(String[] args) {
		//异常类初始化
		IllegalArgumentException ex1 = new IllegalArgumentException("Wrong Argument"); //
		//异常信息的获取
		try{
			System.out.println(sum(new int[]{1,2,3,4,5}));
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("\n" + ex.getMessage());
			System.out.println("\n" + ex.toString());

			System.out.println("从getStackTrace()中获取的信息如下：");
			StackTraceElement[] traceElements = ex.getStackTrace();
			for(int i = 0; i < traceElements.length; i++){
				System.out.print("方法名：" + traceElements[i].getMethodName());
				System.out.print("(" + traceElements[i].getClassName() + ":");
				System.out.println(traceElements[i].getLineNumber() + ")");
			}

		}		
	}


	public static int sum(int[] list){
		int result = 0;


		for(int i = 0; i <= list.length; i++){
			result += list[i];
		}
		return result;
	}
}