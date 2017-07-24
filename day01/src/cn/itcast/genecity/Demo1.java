package cn.itcast.genecity;

/*

泛型 的好处：
	1. 把运行时出现 的问题提前至了编译时。
	2. 避免了无谓的强制类型转换。
	

泛型在集合中的应用：
	ArrayList<String> list = new ArrayList<String>();  true    
	
	ArrayList<Object> list = new ArrayList<String>();  false   
	ArrayList<String> list = new ArrayList<Object>();  false   

考虑到新老系统兼用性：

	ArrayList   list = new ArrayList<String>();        true   
	ArrayList<String> list = new ArrayList();          true    

注意： 在泛型中没有多态的概念，两边的数据必须要一致。 或者是只写一边 的泛型类型。

推荐使用： 两边的数据类型都写上一致的。
*/
/*
 * 泛型方法的定义格式： 修饰符 <声明自定义泛型>返回值类型		 函数名(形参列表...)
 * 自定义泛型：可以理解为一个数据类型的占位符，或者一个数据类型的变量
需求：定义一个函数可以接受任意类型的参数，要求函数的返回值类型与实参的数据类型一致
*/
/*
 * 泛型类的定义格式： 
 * class 类名<声明自定义的泛型>{
 * }
 */
/*
 * 泛型接口的定义格式： 
 * interface 接口名<声明自定义的泛型>{
 * }
 */

//自定义集合对象
class MyList<T>{
	
	Object[] arr = new Object[10];
	int index = 0;
	
	public MyList(){
		
	}
	
	public void add(T o){
		arr[index++] = o;
	}
	
}

public class Demo1 {
	public static void main(String[] args){
		
		Integer i = print(12);
		String str = print("abcde");
	}
	
	//把T字母声明为自定义的类型
	public static <T> T print(T o){
		
		return o;
	}
}
