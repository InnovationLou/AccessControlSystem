package com.foo.ControlSystem.validate;

import java.util.ArrayList;


public class CardVld extends GenericValidate {

	public CardVld()
	{
		this.inner.add("1234");
	}

	private ArrayList<String> inner=new ArrayList<String>();  // ϵͳ���е������Ϣ
	private String input;    // ��Ҫ��֤����Ϣ

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
	 * @param ����Ҫ������֤����Ϣ
	 */
	public void setInput(String input) {
		this.input = input;
	}

	/**
	 * @return ��ȡҪ������֤����Ϣ 
	 */
	public Object getInput() {
		return input;
	}
}
