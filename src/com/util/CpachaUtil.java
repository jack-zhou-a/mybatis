package com.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

public class CpachaUtil {
	/*
	 * 验证码来源
	 */
	final private char[] code= {
		'2','3','4','5','6','7','8','9',
		'a','q','w','e','r','t','y','u','i','o','p','s','d','f','g','h',
		'j','k','z','x','c','v','b','n','m'
	};
	
	/**
	 * 字体
	 */
	
	final private String[] fontNames=new String[] {
		"黑体","宋体","Courier","Arial","Verdana","Times","Tahoma","Georgia"	
	};
	
	/**
	 * 字体样式
	 */
	final private int[] fontStyle=new int[] {
			Font.BOLD,Font.ITALIC|Font.BOLD
	};
	
	/*
	 * 验证码长度
	 * 默认四个字符
	 */
	private int vcodeLen=4;
	
	/*
	 * 验证码默认字体大小
	 * 默认17
	 */
	private int fontsize=17;
	
	/*
	 * 验证码图片宽度
	 * 
	 */
	private int width=(fontsize+1)*vcodeLen+10;
	/*
	 * 验证码图片高度
	 * 
	 */
	private int height=fontsize+12;
	/**
	 * 干扰线条数
	 * 默认3条
	 */
	private int disturbline=3;
	
	public CpachaUtil() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 指定验证码长度
	 * @param vcodelLen
	 */
	public CpachaUtil(int vcodelLen) {
		this.vcodeLen=vcodelLen;
		// TODO Auto-generated constructor stub
	}
	/*
	 * 指定验证码长度，图片高度，宽度
	 */
	public CpachaUtil(int vcodelLen,int width,int height) {
		this.vcodeLen=vcodelLen;
		this.width=width;
		this.height=height;
		// TODO Auto-generated constructor stub
	}
	/*
	 * 生成验证码图片
	 * 
	 */
	public BufferedImage gBufferedImage(String vcode,boolean drawline) {
		//创建验证码图片
		BufferedImage vcodeImage=new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics g = vcodeImage.getGraphics();
		//填充背景颜色
		g.setColor(new Color(246,240,250));
		g.fillRect(0, 0, width, height);
		if(drawline) {
		//	drawDisturbLine(g);
			
		}
		//用于生成随机数
		Random ran=new Random();
		//在图片上画验证码
		for (int i = 0; i < vcode.length(); i++) {
			//设置字体
		//	g.setFont(new Font(fontNames[ran.nextInt(fontNames.length)], fontStyle[ran.nextInt(bound)], size));
			//随机生成颜色
			//g.setColor(getRandomColor);
			//画验证码
			g.drawString(vcode.charAt(i)+"",i*fontsize+10 , fontsize+5);
		}
		//
		return null;
	}
}
