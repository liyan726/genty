package com.genty.others;


import java.io.UnsupportedEncodingException;

/**
 *  ��������util
 * @author shitou.li
 * 2014��11��21�� ����3:36:52
 */
public class Encord {
   public static String Utf8Change(String name) throws UnsupportedEncodingException{
	   
	   byte bb[];
       bb = name.getBytes("ISO-8859-1"); //��"ISO-8859-1"��ʽ����name�ַ���
       name= new String(bb, "UTF-8"); 
       return name;
   }
}
