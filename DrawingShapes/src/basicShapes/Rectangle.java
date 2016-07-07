package basicShapes;

import java.io.Console;

public class Rectangle extends Shapes {
	public int _height= 0;
	public int _width= 0;
	
	public Rectangle(int height, int width){
		super(3);
		System.out.println(this.getClass()+ "init");
		_height = height;
		_width = width;
	}
	public void Draw(){
		System.out.println(this.getClass() + " height / width = " + Integer.toString(_height) + " / " + Integer.toString(_width));
		// Top and Bottom
		char top[] = new char[_width*2];
		char side[] = new char[_width*2];
		for(int i=0; i<2*_width; i++){top[i]='-';}
		//Print edges like '|        |'
		side[0] = '|';		side[2*_width-1] = '|';
		for(int i=1; i<2*_width-1; i++){side[i]=' ';}
		System.out.println(top);
		for(int i=1; i<_height-1; i++){System.out.println(side);}
		System.out.println(top);
	}

}
