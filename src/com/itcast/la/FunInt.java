package com.itcast.la;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Function接口 跟 BiFunction接口
 * @author 13069
 *
 */
public class FunInt {
	public static void main(String[] args) {
		System.out.println("Function接口");
		Function<Integer, Double> milesToKms = (inpute)->1.6 * inpute;
		int miles = 3;
		//Function<T,R>接口定义了apply方法，带一个参数，并返回一个值。
		double kms = milesToKms.apply(miles);
		System.out.printf("%d miles = %3.2f kilometers\n",miles,kms);
		
		//返回值结果可以与参数类型不同
		System.out.println("BiFunction接口");
		BiFunction<Float, Float, Float> area = (width,length)->width * length;
		float width = 7.0F;
		float length = 10.0F;
		float result = area.apply(width, length);
		System.out.println(result);
		
		//Predicate接口
		//判断输入字符每个字符都是数字 return ture
		System.out.println("Predicate接口");
		Predicate<String> numbersOnly = (inpute) -> {
			for (int i = 0; i < inpute.length(); i++) {
				char c = inpute.charAt(i);
				if ("0123456789".indexOf(c) == -1) {
					return false;
				}
			}
			return true;
		};
		System.out.println(numbersOnly.test("012345"));
		System.out.println(numbersOnly.test("100a"));
		
		//Supplier接口
		System.out.println("Supplier接口");
		Supplier<Integer> oneDigitRandom = () -> {
			Random random = new Random();
			return random.nextInt(10);
		};
		for (int i = 0; i < 5; i++) {
			System.out.println(oneDigitRandom.get());
		}
		
		System.out.println("Consumer接口");
		
		Function<Integer, String> spacer = (count) -> {
			//StringBuilder构造一个其中不带字符的字符串生成器，初始容量由 capacity 参数指定。
			StringBuilder sb = new StringBuilder(count);
			for (int i = 0; i < count; i++) {					
				sb.append(" ");
			}
			
		return sb.toString();
		};
		
		int lineLength = 60; //每行最大字符串
		Consumer<String> printCentered = (input) -> {
			int length1	 = input.length();
			String space = spacer.apply(
					(lineLength-length1)/2);
					System.out.println(space+input);
		};
		printCentered.accept("A lambda expression a day");
		printCentered.accept("makes you");
		printCentered.accept("look smarter");
		
		
	}
}
