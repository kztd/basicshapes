package basicShapes;

public class Shapes {
	public int _type = 0;
	
	public void Print(){
		System.out.println(this.getClass() + " +++++++++++Type "+ _type + "+++++++++++++++");
			
		
	}
	public Shapes(int type){
		System.out.println(this.getClass() + " super constructor");
		_type = type;
		
	}

}
