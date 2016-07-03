package basicShapes;

import java.io.Console;

public class Square extends Shapes {
	public int _side = 0;
	
	public Square(int side){
		super(1);
		System.out.println(this.getClass()+ "init");
		_side = side;
	}
	public void Draw(){
		System.out.println(this.getClass() + " side = " + Integer.toString(_side));
		// Top and Bottom
		char top[] = new char[_side*2];
		char side[] = new char[_side*2];
		for(int i=0; i<2*_side; i++){top[i]='-';}
		//Print edges like '|        |'
		side[0] = '|';		side[2*_side-1] = '|';
		for(int i=1; i<2*_side-1; i++){side[i]=' ';}
		System.out.println(top);
		for(int i=1; i<_side-1; i++){System.out.println(side);}
		System.out.println(top);
	}

}
