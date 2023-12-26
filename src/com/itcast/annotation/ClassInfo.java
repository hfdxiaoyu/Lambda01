package com.itcast.annotation;

//学习注解类型

//没有元素的注解称为标记注解（marker annotation）,与标记接口类似
public @interface ClassInfo {
	String created();
	String author();
	String lastModified();
//	int Version();
	//使用Version注解类型来定义version
	Version version();
}
