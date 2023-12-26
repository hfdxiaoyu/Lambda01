package com.itcast.enmuClass;

/**
 * 支付参数枚举类型
 * @author 13069
 *
 */
public enum PayEnum {
	//枚举项，采用全部大写命名
	//枚举项就是一个一个对象，它是常量,可定义枚举项的时候调用构造方法
	WEIXINPAY("weixing","https://api.mch.weixing.qq.com/pay/"),
	ALIPAY("ali","https://openapi.alipay.com/"),
	UNIONPAY("union","https://geteway.95516.com/gateaway/api/");
	
	private String name;//支付名称
	private String payUrl;//支付地址
	
	//定义构造方法，枚举类型的构造方法是private
	private PayEnum() {
		
	}
	//带参构造方法
	private PayEnum(String name,String payurl) {
		this.name=name;
		this.payUrl=payurl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPayUrl() {
		return payUrl;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	
	public static void main(String[] args) {
		//枚举项就是一个对象（实例）
		PayEnum weixingPay = PayEnum.WEIXINPAY;
		System.out.println(weixingPay.getName());
		System.out.println(weixingPay.getPayUrl());
		
		//枚举项之间使用==进行比较
		PayEnum aliPay = PayEnum.ALIPAY;
		System.out.println(aliPay == PayEnum.ALIPAY);
		
	}
}
