/**
 * HashMap的几种遍历方式
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class TraverseMap{
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
  		map.put("1", "value1");
  		map.put("4", "value4");
  		map.put("2", "value2");
  		map.put("3", "value3");

  		method1(map);
  		method2(map);
  		method3(map);
  		method4(map);

	}

	//第一种：普遍使用, 二次取值
	public static void method1(HashMap<String,String> map){
		System.out.println("通过Map.keySet遍历key和value：");
		for (String key : map.keySet()) {
			System.out.println("key= "+ key + " and value= " + map.get(key));
		}

	}

	//第二种：Map.entrySet()的迭代器
	public static void method2(HashMap<String,String> map){
		System.out.println("通过Map.entrySet使用iterator遍历key和value：");
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}
		
	}

	//第三种：推荐，尤其是容量大时
	public static void method3(HashMap<String,String> map){
		System.out.println("通过Map.entrySet遍历key和value");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}
	}

	//第四种：只遍历value值
	public static void method4(HashMap<String,String> map){
		System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
		for (String v : map.values()) {
			System.out.println("value= " + v);
		}
	}	
}