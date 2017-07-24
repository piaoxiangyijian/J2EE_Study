package cn.itcast.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//集合

public class Demo2 {
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<String>();
		//使用get方法遍历
		list.add("三");
		list.add("四");
		list.add("五");
		
		System.out.println("=====get方式遍历=======");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+",");
		}
		
		System.out.println("=====迭代器方式遍历=======");
		Iterator<String> it=list.iterator();//获取迭代器
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
		
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("zhang", "001");
		map.put("Li", "002");
		map.put("Wang", "003");
		
		Set<Entry<String,String>> entrys = map.entrySet();
		for(Entry<String,String> entry : entrys) {
			System.out.println("Key: "+entry.getKey()+", value: "+entry.getValue());
		}
	}
}
