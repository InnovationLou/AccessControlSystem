package com.foo.ControlSystem.validate;

import java.util.ArrayList;

public class PassWordVld extends GenericValidate {

	public PassWordVld()
	{		
		this.inner.add(2468);
	}

	private ArrayList<Integer> inner=new ArrayList<Integer>();  // ϵͳ���е������Ϣ
	private String input;    // ��Ҫ��֤����Ϣ

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
