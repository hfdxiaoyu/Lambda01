package com.itcast.enmuClass;

/**
 * 系统代码的枚举类型
 * @author 13069
 *
 */
public enum CodeEnum implements SystemCode {
	ERROR(-1,"系统异常"),
	FAILURE(0,"操作失败"),
	SUCCESSFUL(1,"操作成功"),
	LOGINSUCCESSFUL(100,"登录成功")
	;
	
	
	private CodeEnum() {
	}
	
	private CodeEnum(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}


	private int code; //系统代码
	private String desc;  //代码对应的描述
	
	@Override
	public int getCode() {
		// TODO Auto-generated method stub
		return code;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return desc;
	}
	
	public static void main(String[] args) {
		
		System.out.println(CodeEnum.SUCCESSFUL.getCode());
		System.out.println(CodeEnum.SUCCESSFUL.getDesc());
		//枚举项可以向上转型为接口类型
		SystemCode code = CodeEnum.SUCCESSFUL;
		System.out.println(code.getCode());
		System.out.println(code.getDesc());
	}
}
