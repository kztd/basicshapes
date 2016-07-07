package basicShapes;

public class Square extends Rectangle {
	public int _side = 0;

	public Square(int side) {
		super(side, side);
		_side = side;
	}
	public void Draw(){
		super.Draw();
	}

}
