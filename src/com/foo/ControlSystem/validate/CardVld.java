package com.foo.ControlSystem.validate;

import java.util.ArrayList;


public class CardVld extends GenericValidate {

	public CardVld()
	{
		this.inner.add("1234");
	}

	private ArrayList<String> inner=new ArrayList<String>();  // 系统已有的身份信息
	private String input;    // 需要验证的信息

	@Override
	public Boolean check(String pasString) {		
		this.setInput(pasString);
		for (String input : inner) {
			
			if(input.equals(this.getInput()))
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
