package com.itcast.annotation;

//注解类型只有一个元素，这个元素应该以value命名
//这样在元素注解时就不需要指定元素名称
public @interface Copyright {
	String value();
}
