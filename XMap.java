// Jerry Zeng and Steven Shi
// April 12, 2021
// Final Project XMap Class
// ICS3U7 Ms. Strelkovska

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;


//made by steven
public class XMap {
	
	//platforms
	private static Platform p1=new Platform(225,550,200,5);
	private static Platform bigP= new Platform(570,400,200,5);
	
	private static Platform p2 = new Platform(915,550,200,5);
	private static Platform p4 = new Platform(225,250,200,5);
	private static Platform p5 = new Platform(915,250,200,5);
	public XMap(){
		


	}
	//draw the platforms
	public static void myDraw(Graphics g){
	
		
		p1.myDraw(g);
		p2.myDraw(g);
		bigP.myDraw(g);
		p4.myDraw(g);
		p5.myDraw(g);
	}

	//get the platforms
	public static Platform getp1() {
		return p1;
	}
	public static Platform getp2() {
		return p2;
	}
	public static Platform getBigP() {
		return bigP;
	}
	public static Platform getp4() {
		return p4;
	}
	public static Platform getp5() {
		return p5;
	}
	
}
