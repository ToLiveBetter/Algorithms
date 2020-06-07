package com.demo.offer;

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * @author gaobaobao
 *
 */
public class NumberAdd {
	
	public static void main(String[] args) {
		System.out.println(Add(13,11));
	}

	public static int Add(int num1,int num2) {
        //用二进制模拟十进制运算，加法算是简单的，要是乘法，除法才是真的复杂
        int a = 0,b = 0;
        do{
            a = num1 ^ num2;
            b = num1 & num2;
            num1 = a;
            num2 = b << 1;
        }while(b != 0);
        
        return a;
    }
}
