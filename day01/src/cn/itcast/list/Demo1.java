package cn.itcast.list;

import java.util.HashSet;

/*
���ϣ� �洢�������� �ļ���������

��������

----------| Collection  �������� �ĸ��ӿ�
----------------| List �����ʵ����List�ӿڵļ����࣬�߱����ص㣺 ���򣬿��ظ���
-------------------| ArrayList ArrayList�ײ���ʹ����Object����ʵ�� �ġ� �ص㣺 ��ѯ�ٶȿ죬��ɾ����
-------------------| LinkedList LinkedList�ײ���ʹ�����������ݽṹʵ�ֵġ��ص㣺 ��ѯ�ٶ�������ɾ��
-------------------| Vector �ײ���ʹ����Object����ʵ�� �ģ� ʵ��ԭ����ArrayList ��һ�µģ��������̰߳�ȫ�ģ�����Ч�ʵ͡�
----------------| Set  �����ʵ����Set�ӿڵļ����࣬�߱����ص㣺 ���򣬲����ظ���
-------------------| HashSet �ײ���ʹ���˹�ϣ��ʵ�� �ġ� �ص㣺 ��ȡ�ٶȿ졣

HashSet�洢Ԫ�ص�ԭ��
 	��hashSet���Ԫ�ص�ʱ�����Ȼ����Ԫ�ص�hashCode�����õ�Ԫ�صĹ�ϣ��ֵ��Ȼ��ѹ�ϣ��ֵ�������������Ԫ�ش��ڹ�ϣ���е�λ�á�
	
	���1����������λ��Ŀǰ��û�д����κε�Ԫ�أ���ô��Ԫ�ؿ���ֱ����ӵ���ϣ���С�
		
	���2�� ��������λ��Ŀǰ�Ѿ�����������Ԫ�أ���ô�������Ԫ�� ��equals�����������λ���� ��Ԫ�رȽ�һ�Ρ�
	���equals�������ص���true����ô��Ԫ�ر���Ϊ�ظ�Ԫ�أ���������ӡ����equals�������� ����false����ô��Ԫ��Ҳ���Ա���ӡ�
------------------| TreeSet  �ײ���ʹ���˺�����������������ݽṹʵ�ֵġ� �ص㣺 �Լ����е�Ԫ�ؽ�������洢����

TreeSetҪע������
	1. ��TreeSet���Ԫ�� ��ʱ�����Ԫ�ؾ߱���Ȼ˳����ص㣬��ôTreeSet�����Ԫ�� ����Ȼ˳�����Խ������� �洢��
	2. ��TreeSet���Ԫ�� ��ʱ�����Ԫ�ز��߱���Ȼ˳����ص�,��ôԪ����������ͱ���Ҫʵ��Comparable�ӿڣ��ѱȽϵĹ�������CompareTo�����ϡ�
	3. ��TreeSet���Ԫ�� ��ʱ�����Ԫ�ز��߱���Ȼ˳����ص�,��ôԪ�����������Ҳû��ʵ��Comparable�ӿڣ���ô�ڴ���TreeSet�����ʱ�����Ҫ����Ƚ�������
	
	�Ƚ��� �Ķ����ʽ:
		
			class ���� implements  Comparator{
			}

˫�м���
	----------| Map �洢�����ݶ����Լ�ֵ�Ե���ʽ���ڵģ������Բ��ظ���ֵ���ظ���
	-------------| HashMap �ײ�Ҳ��ʹ���˹�ϣ��ʵ�ֵġ�
	-------------| TreeMap �ײ�Ҳ��ʹ���˺�������ݽṹʵ�ֵġ� 


��ϰ�� 






 */
class Person{
	int id;
	
	String name;
	
	public Person(int id, String name){
		super();
		this.id=id;
		this.name=name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p=(Person)obj;
		return this.id==p.id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "��ţ� "+this.id+" ������ "+this.name;
	}
	
}

public class Demo1 {
	public static void main(String[] args){
		HashSet<Person> set=new HashSet<Person>();
		set.add(new Person(110,"����"));
		set.add(new Person(110,"����"));
		System.out.println("���ϵ�Ԫ�أ� "+set);
	}
}
