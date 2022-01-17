/**
 * 
 */
package com.rajendra.Model;

/**
 * @author rajendra
 *
 */
public abstract class Person {

	public Person(String userName,String sex, Number age) {
		this.sex = sex;
		this.age = age;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Number getAge() {
		return age;
	}

	public void setAge(Number age) {
		this.age = age;
	}


	private String sex;
	private Number age;
	private String userName;


}
