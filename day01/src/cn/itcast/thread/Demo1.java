package cn.itcast.thread;
/*
�̣߳�

���̵߳ĺô��� ���߳̽������һ��������ͬʱ����ִ�ж�������������⡣


�Զ����̵߳Ĵ�����ʽ��

	
	��ʽһ���̳�Thread.
		1. �Զ���һ����̳�Thread�ࡣ
		2. ��дThread��run���������Զ����̵߳�������붨����run�����ϡ�
		3. ����Thread����Ķ��󣬲��ҵ���start��������һ���̡߳�

	
	��ʽ���� ʵ��Runnable�ӿڡ�
		1. �Զ���һ����ʵ��Runnable�ӿڡ�
		2. ʵ��Runnable�ӿ��е�run���������Զ����̵߳�������붨����run�����ϡ�
		3. ����Runableʵ���� �Ķ���
		4. ����Thread���󣬲��Ұ�Runnableʵ����Ķ�����Ϊ�������ݡ�
		5. ����Thread�����start���������̡߳�
		
�̰߳�ȫ ����Ľ��������

�̰߳�ȫ������� �ĸ���ԭ��
	1. ����Ҫ�������������������ϵ��̹߳�����һ����Դ��
	2. ����������Դ�Ĵ����������������������ϡ�
	


	1. ͬ�������
		
		synchronized(��){
			��Ҫ��ͬ���Ĵ���
		}
		
		
		
	2. ͬ��������
		
		���η� synchronized ����ֵ����   ������(�β��б�..){
		
		}
		
		
	ע�⣺
		1. ͬ��������������������Ķ��� ͬ�����������ǹ̶� �ģ��Ǿ�̬��������������this���� ��̬��������������class����
		2. ����������Ƕ��̹߳���Ķ��󣬷�������ס��
		3. ��ͬ������������ͬ�������е���sleep�����ǲ����ͷ�������ģ�����ǵ�����wait�����ǻ��ͷ�������ġ�

 */

public class Demo1 {

	public static void main(String[] args) {
		//�߳��ࡪ������2
		Runner1 r = new Runner1();
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<15;i++){
			System.out.println("Main: "+ i);
		}
	}

}

class Runner1 implements Runnable{
	//��дrun����
	@Override
	public void run() {
		for(int i=0;i<15;i++){
			System.out.println("Runner1: "+i);
		}
	}
	
}
