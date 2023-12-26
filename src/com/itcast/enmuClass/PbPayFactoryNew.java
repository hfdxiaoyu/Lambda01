package com.itcast.enmuClass;

public class PbPayFactoryNew {
	
	/**
	 * 生产支付对象方法，使用枚举类进行比较
	 * @return
	 */
	public static String getPay(PayEnum payEnum) {
		
		switch (payEnum) {
		case WEIXINPAY: //这里要匹配枚举项
			//构造一个微信支付对象
			System.out.println("构造一个微信支付对象");
			break;
		case ALIPAY:
			System.out.println("构造一个支付宝支付对象");		
			break;
				
		case UNIONPAY:
			System.out.println("构造一个银联支付对象");
			break;

		default:
			break;
		}
		
		return "";
	}
	
	public static void main(String[] args) {
		//将枚举项传入工厂方法
		PbPayFactoryNew.getPay(PayEnum.WEIXINPAY);
		PbPayFactoryNew.getPay(PayEnum.ALIPAY);
	}
}
