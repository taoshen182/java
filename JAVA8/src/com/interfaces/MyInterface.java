package com.interfaces;

public interface MyInterface {
	public abstract double calculate(int a);

	//接口的默认方法--其实现类可以直接使用
    default double sqrt(int a) {
        return Math.sqrt(a);
    }

}
