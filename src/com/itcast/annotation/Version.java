package com.itcast.annotation;

public @interface Version {
	//default 设置默认值
	int major() default 1;
	int minor() default 0;
}
