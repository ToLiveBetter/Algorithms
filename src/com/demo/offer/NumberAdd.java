package com.demo.offer;

/**
 * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
 * @author gaobaobao
 *
 */
public class NumberAdd {
	
	public static void main(String[] args) {
		System.out.println(Add(13,11));
	}

	public static int Add(int num1,int num2) {
        //�ö�����ģ��ʮ�������㣬�ӷ����Ǽ򵥵ģ�Ҫ�ǳ˷�������������ĸ���
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
