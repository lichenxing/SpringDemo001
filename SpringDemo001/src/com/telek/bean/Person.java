
package com.telek.bean;

/**
 * �ٶ���һ�� ����Axe�����person��
 * 
 *
 */
public class Person {
	private Axe axe;

	public void setAxe(Axe axe) {
		this.axe = axe;
	}
	
	public void useAxe(){
		System.out.println("�Ҵ���ȥ������");
		//����axe��chop����
		//����person��������axe����
		System.out.println(axe.chop());
	} 
	

}
