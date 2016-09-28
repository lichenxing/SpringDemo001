
package com.telek.bean;

/**
 * 再定义一个 依赖Axe对象的person类
 * 
 *
 */
public class Person {
	private Axe axe;

	public void setAxe(Axe axe) {
		this.axe = axe;
	}
	
	public void useAxe(){
		System.out.println("我打算去砍点柴火！");
		//调用axe的chop方法
		//表明person对象依赖axe对象
		System.out.println(axe.chop());
	} 
	

}
