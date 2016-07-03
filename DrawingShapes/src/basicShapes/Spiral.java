package basicShapes;

public class Spiral extends Shapes {

	int _side = 0;
	
	public Spiral(int side){
		super(2);
		_side = side;
		System.out.println(this.getClass()+ "class constructor");
		
	}
	public void Print(){
		super.Print();
		System.out.println(this.getClass()+ "Print()");
		char A[][] = new char[_side][_side];
		for(int i=0;i<_side;i++){
			for(int j=0;j<_side;j++){
				A[i][j] = ' ';
			}
		}
		// Draw in spiral, direction rotates from right - down - left - up
		// number of chars to draw decreases by 1 each turn
		int nDrawChars = _side;
		int x = 0;
		int y = 0;
		int nDir = 0;
		try{
		
		for (int nSide=1;nSide<=_side;nSide++){
			for(int i=0;i < nDrawChars;i++){
				A[y][x] = 'x';
				if(i == nDrawChars-1){
					nDir++;
					if(nDir > 3){nDir = 0;}
				}
				if(nDir == 0){x++;}
				if(nDir == 1){y++;}
				if(nDir == 2){x--;}
				if(nDir == 3){y--;}
			}
			nDrawChars--;
		}
		}catch(java.lang.ArrayIndexOutOfBoundsException e){
			System.out.println(this.getClass()+ "Exception()");
		}
		
		//Print Array
		for(int i=0;i < _side;i++){
			System.out.println(A[i]);
		}
	}
}
