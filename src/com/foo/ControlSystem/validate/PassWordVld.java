package com.foo.ControlSystem.validate;

import java.util.ArrayList;

public class PassWordVld extends GenericValidate {

	public PassWordVld()
	{		
		this.inner.add(2468);
	}

	private ArrayList<Integer> inner=new ArrayList<Integer>();  // 系统已有的身份信息
	private String input;    // 需要验证的信息

	@Override
	public Boolean check(String pasString) {
		// TODO Auto-generated method stub
		int pwd=Integer.parseInt(pasString);
		
		this.setInput(pasString);
		for (int input : inner) {
			
			if(input==pwd)
			{
				return true;
			}
		}
		return false;
		
	}
	/**
	 * @param 输入要进行验证的信息
	 */
	public void setInput(String input) {
		this.input = input;
	}

	/**
	 * @return 获取要进行验证的信息 
	 */
	public Object getInput() {
		return input;
	}

}
