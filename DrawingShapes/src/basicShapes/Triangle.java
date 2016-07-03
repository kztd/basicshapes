package basicShapes;

public class Triangle extends Shapes {
	int _side = 0;
	public Triangle(int side){
		super(3);
		_side = side;
	}
	public void Print(){
		System.out.println(this.getClass()+ "Print()");
		// Init Array
		char A[][] = new char[_side][_side];
		for(int i=0;i<_side;i++){
			for(int j=0;j<_side;j++){
				A[i][j] = ' ';
			}
		}
		// Draw in Triangle, start with |\ and continue to --- at bottom
		//
		try{
		int nDiagonal;
		for(nDiagonal =0;nDiagonal < _side-1; nDiagonal++){
			// y x order	
			A[nDiagonal][0] = '|';
			A[nDiagonal][nDiagonal+1] = '\\';
		}
		for(int i=0;i < _side;i++){
			A[_side-1][i] = '-';
		}
		}catch(java.lang.ArrayIndexOutOfBoundsException ex) {			
		}
		//Print Array
		for(int i=0;i < _side;i++){
			System.out.println(A[i]);
		}


		
	}
	

}
