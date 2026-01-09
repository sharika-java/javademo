package com.sample.SampleMaven;

public class SpringCls_A {
 
	
	SpringCls_B obj;
	public SpringCls_A(SpringCls_B obj) {
		this.obj = obj;
	}
	// setter method for setter injection for java based configuration
	/*public void setObj(SpringCls_B obj) {
		this.obj = obj;
	}*/
	
	// setter method for xml based
	/*public void setObj(SpringCls_B obj ) {
        System.out.println("Hello, Spring Context is working!");
        this.obj =  obj;
    }*/
	void add() {
		obj.display();
	}
}
