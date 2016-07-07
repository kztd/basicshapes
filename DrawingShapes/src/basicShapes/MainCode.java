package basicShapes;

public class MainCode {

	public static void main(String[] args) {
		Rectangle rct = new Rectangle(10,15);
		rct.Draw();
		Spiral sp = new Spiral(5);
		sp.Print();
		Triangle tr = new Triangle(5);
		tr.Print();
		Square sq = new Square(10);
		sq.Print();
	}
}
