package cn.itcast.genecity;

/*

���� �ĺô���
	1. ������ʱ���� ��������ǰ���˱���ʱ��
	2. ��������ν��ǿ������ת����
	

�����ڼ����е�Ӧ�ã�
	ArrayList<String> list = new ArrayList<String>();  true    
	
	ArrayList<Object> list = new ArrayList<String>();  false   
	ArrayList<String> list = new ArrayList<Object>();  false   

���ǵ�����ϵͳ�����ԣ�

	ArrayList   list = new ArrayList<String>();        true   
	ArrayList<String> list = new ArrayList();          true    

ע�⣺ �ڷ�����û�ж�̬�ĸ�����ߵ����ݱ���Ҫһ�¡� ������ֻдһ�� �ķ������͡�

�Ƽ�ʹ�ã� ���ߵ��������Ͷ�д��һ�µġ�
*/
/*
 * ���ͷ����Ķ����ʽ�� ���η� <�����Զ��巺��>����ֵ����		 ������(�β��б�...)
 * �Զ��巺�ͣ��������Ϊһ���������͵�ռλ��������һ���������͵ı���
���󣺶���һ���������Խ����������͵Ĳ�����Ҫ�����ķ���ֵ������ʵ�ε���������һ��
*/
/*
 * ������Ķ����ʽ�� 
 * class ����<�����Զ���ķ���>{
 * }
 */
/*
 * ���ͽӿڵĶ����ʽ�� 
 * interface �ӿ���<�����Զ���ķ���>{
 * }
 */

//�Զ��弯�϶���
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
	
	//��T��ĸ����Ϊ�Զ��������
	public static <T> T print(T o){
		
		return o;
	}
}
