/**   
* @Title: Kid.java 
* @Package com.hp.model 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Eric  
* @date Jun 23, 2016 5:59:03 PM 
* @version V1.0   
*/
package com.hp.model;

import java.io.Serializable;

/** 
* @ClassName: Kid 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Eric 
* @date Jun 23, 2016 5:59:03 PM 
*  
*/
public class Kid implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2069203244409948313L;
	private String name ;
	private int age;
	private String addr;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}
	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}
	/**
	 * @param name
	 * @param age
	 * @param addr
	 */
	public Kid(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	
}
