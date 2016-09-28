/**
 * 
 */
package com.telek.dao;

/**
 * @author Administrator
 *
 */
public class PersonImpl implements Person {

	/* (non-Javadoc)
	 * @see com.telek.dao.Person#useAxe()
	 */
	private Axe axe;
	//设置注入所需的setter方法
	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	
	@Override
	public void useAxe() {
		 System.out.println(axe.chop());
	}


	
}
